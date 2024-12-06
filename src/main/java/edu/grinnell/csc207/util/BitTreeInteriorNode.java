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
  BitTreeNode left;

  /**
   * The right child node.
   */
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
   * @return The right node.
   */
  @Override
  public BitTreeNode getLeft() {
    return this.left;
  } // getLeft()

  /**
   * Return the right child.
   * @return The right node.
   */
  @Override
  public BitTreeNode getRight() {
    return this.right;
  } // getRight()

  /**
   * Set the left child.
   * @param node The new value.
   */
  @Override
  public void setLeft(BitTreeNode node) {
    this.left = node;
  } // setLeft()

  /**
   * Set the right child.
   * @param node The new value.
   */
  @Override
  public void setRight(BitTreeNode node) {
    this.right = node;
  } // setRight()
} // class BitTreeInteriorNode
