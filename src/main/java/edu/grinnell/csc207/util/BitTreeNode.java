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
  public BitTreeNode getLeft() {
    throw new UnsupportedOperationException();
  } // getLeft()

  /**
   * Get the right child, if such a thing makes sense.
   * @return The right child.
   */
  public BitTreeNode getRight() {
    throw new UnsupportedOperationException();
  } // getRight()

  /**
   * Get the value of the node, if such a thing makes sense.
   * @return The value.
   */
  public String getValue() {
    throw new UnsupportedOperationException();
  } // getLeft()

  /**
   * Traverse the bit tree.
   * @param bit The bit either 0 or 1.
   * @return The left node if bit is 0, right if 1.
   */
  public BitTreeNode traverse(char bit) {
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
