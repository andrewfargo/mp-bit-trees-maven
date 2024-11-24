package edu.grinnell.csc207.util;

import java.io.BufferedReader;
import java.io.PrintWriter;

import java.util.Arrays;
import java.stream.Stream;

/**
 * Trees intended to be used in storing mappings between fixed-length 
 * sequences of bits and corresponding values.
 *
 * @author Andrew Fargo
 */
public class BitTree {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * How many bits our input takes.
   */
  private int depth;

  /**
   * The top of our tree.
   */
  private BitTreeNode head;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Construct a new tree.
   * @param n The depth of the tree.
   *   Equal to the length of input strings.
   */
  public BitTree(int n) {
    this.depth = n;
    // It's nice to know a head exists.
    this.head = new BitTreeInteriorNode(null, null);
  } // BitTree(int)

  // +---------------+-----------------------------------------------
  // | Local helpers |
  // +---------------+

  /**
   * Recursively dump the contents of the tree.
   * @param pen The output writer.
   * @param bits The traversals we've taken so far.
   * @param BitTreeNode The node we're on.
   */
  private void dumpRecurse(PrintWriter pen, String bits, BitTreeNode node) {
    if (node == null) {
      return;
    } else if (node instanceof BitTreeLeaf) {
      pen.println(bits + "," + node.getValue());
    } else {
      dumpRecurse(pen, bits + "0", node.traverse('0'));
      dumpRecurse(pen, bits + "1", node.traverse('1'));
    } // if/else
  } // dumpRecurse
  
  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Register a series of n bits to a string value.
   * @param bits The n length string of 0s and 1s.
   * @param value The associated value.
   * @throws IndexOutOfBoundsException if the bitstring
   * is formatted incorrectly.
   */
  public void set(String bits, String value) {
    if (bits.length() != depth) {
      throw new IndexOutOfBoundsException();
    } // if
    Stream<Character> cstream = Arrays.stream(bits.toCharArray());
    BitTreeNode node = this.head;

    // The last element may not be an interior node.
    cstream.limit(depth - 1).forEach(b -> {
	if (node.traverse(b) == null) {
	  node.traverse(b) = new BitTreeInteriorNode(null, null);
	} // if
	node = node.traverse(b);
      });

    // Overwrite regardless.
    node.traverse(bitArr[depth - 1]) = new BitTreeLeaf(value);
  } // set(String, String)

  /**
   * Get a value from an input string of bits.
   * @param bits The input string.
   * @return The value if it exists.
   * @throws IndexOutOfBoundsException if the value is not present,
   * or if the input string is formatted incorrectly.
   */
  public String get(String bits) {
    if (bits.length() != depth) {
      throw new IndexOutOfBoundsException();
    } // if
    Stream<Character> cstream = Arrays.stream(bits.toCharArray());
    BitTreeNode node = this.head;
    cstream.forEach(b -> node = node.traverse(b));
    return node.getValue();
  } // get(String, String)
  
  /**
   * Prints the contents of the bit tree in bit order.
   * @param pen The output writer.
   */
  public void dump(PrintWriter pen) {
    dumpRecurse(pen, "", this.head);
  } // dump(PrintWriter)

  /**
   * Takes output of format from dump() and creates a new tree.
   * In CSV format [BITSTRING],[VALUE].
   *
   * @param source A reader to get the lines from. Could be a string,
   *   bytes, file, etc.
   */
  public void load(Reader source) {
    Stream<String> lines = (new BufferedReader(source)).lines();
    lines.forEach(l -> this.set(l.substring(0, depth), l.substring(depth)));
  } // load(InputStream)
} // class BitTree
