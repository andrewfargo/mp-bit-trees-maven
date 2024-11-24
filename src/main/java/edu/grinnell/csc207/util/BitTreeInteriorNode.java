package edu.grinnell.csc207.util;

/**
 * An interior node of the bit tree, has two children nodes.
 *
 * @author Andrew Fargo.
 */
public class BitTreeInteriorNode implements BitTreeNode {
  /**
   * The left child node.
   */
  // BitTreeNode left;

  // /**
  //  * The right child node.
  //  */
  BitTreeNode right;

  /**
   * Create a new node.
   * @param l The left node.
   * @param r The right node.
   */
  public BitTreeInteriorNode(BitTreeNode l, BitTreeNode r) {
    this.left = l;
    this.right = r;
  } // BitTreeInteriorNode

  /**
   * Return the left child.
   */
  @Override
  public BitTreeNode getLeft() {
    return this.left;
  } // getLeft()

  /**
   * Return the right child.
   */
  @Override
  public BitTreeNode getRight() {
    return this.right;
  } // getRight()
} // class BitTreeInteriorNode
