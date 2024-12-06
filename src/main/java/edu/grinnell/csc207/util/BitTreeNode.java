package edu.grinnell.csc207.util;

/**
 * A common interface representing the node of a bit tree.
 *
 * @author Andrew Fargo
 */
public interface BitTreeNode {
  /**
   * Get the left child, if such a thing makes sense.
   * @return The left child.
   */
  public default BitTreeNode getLeft() {
    throw new UnsupportedOperationException();
  } // getLeft()

  /**
   * Get the right child, if such a thing makes sense.
   * @return The right child.
   */
  public default BitTreeNode getRight() {
    throw new UnsupportedOperationException();
  } // getRight()

  /**
   * Get the value of the node, if such a thing makes sense.
   * @return The value.
   */
  public default String getValue() {
    throw new UnsupportedOperationException();
  } // getLeft()

  /**
   * Set the left value of the node, if such a thing makes sense.
   * @param node The new value
   */
  public default void setLeft(BitTreeNode node) {
    throw new UnsupportedOperationException();
  } // setLeft()

  /**
   * Set the right value of the node, if such a thing makes sense.
   * @param node The new value
   */
  public default void setRight(BitTreeNode node) {
    throw new UnsupportedOperationException();
  } // setRight()

  /**
   * Set the value of the node based on a bit.
   * @param bit The bit of the bitstring.
   * @param node The new value.
   */
  public default void setNode(char bit, BitTreeNode node) {
    switch (bit) {
      case '0':
        this.setLeft(node);
        break;
      case '1':
        this.setRight(node);
        break;
      default:
        throw new IndexOutOfBoundsException();
    } // switch
  } // setNode()

  /**
   * Traverse the bit tree.
   * @param bit The bit either 0 or 1.
   * @return The left node if bit is 0, right if 1.
   */
  public default BitTreeNode traverse(char bit) {
    switch (bit) {
      case '0':
        return this.getLeft();
      case '1':
        return this.getRight();
      default:
        throw new IndexOutOfBoundsException();
    } // switch
  } // traverse(char)
} // BitTreeNode
