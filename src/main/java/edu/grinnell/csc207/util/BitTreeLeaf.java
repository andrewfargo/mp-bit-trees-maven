package edu.grinnell.csc207.util;

/**
 * A leaf value of the bit tree.
 *
 * @author Andrew Fargo
 */
public class BitTreeLeaf implements BitTreeNode {
  /**
   * The value of the leaf.
   */
  String value;

  /**
   * Create a new leaf.
   *
   * @param v The value of the leaf.
   */
  public BitTreeLeaf(String v) {
    this.value = v;
  } // BitTreeLeaf(String)

  @Override
  public getValue() {
    return this.value;
  } // getValue()
} // BitTreeLeaf
