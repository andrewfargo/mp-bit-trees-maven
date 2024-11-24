package edu.grinnell.csc207.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

/**
 *
 *
 * @author Your Name Here
 * @author Samuel A. Rebelsky
 */
public class BrailleAsciiTables {
  // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /**
   * Conversions from braille to ASCII.
   */
  static final String b2a = 
      """
      100000,A
      110000,B
      100100,C
      100110,D
      100010,E
      110100,F
      110110,G
      110010,H
      010100,I
      010110,J
      101000,K
      111000,L
      101100,M
      101110,N
      101010,O
      111100,P
      111110,Q
      111010,R
      011100,S
      011110,T
      101001,U
      111001,V
      101101,X
      101111,Y
      101011,Z
      010111,W
      000000, 
      """;

  // +---------------+-----------------------------------------------
  // | Static fields |
  // +---------------+

  /**
   *
   */
  static BitTree a2bTree;

  /**
   *
   */
  static BitTree b2aTree;

  /**
   *
   */
  static BitTree b2uTree;

  // +-----------------------+---------------------------------------
  // | Static helper methods |
  // +-----------------------+

  static {
    // This code definitely calls for better organization.
    // Perhaps extend the BitTree to include a table?
    // It's difficult to say what may be best; for now this is good.
    sReader = new StringReader(a2b);
    a2bTree.load(sReader);
    sReader.close();
    sReader = new StringReader(b2a);
    b2aTree.load(sReader);
    sReader.close();
    sReader = new StringReader(b2u);
    b2uTree.load(sReader);
    sReader.close();
  } // static
  
  // +----------------+----------------------------------------------
  // | Static methods |
  // +----------------+

  /**
   * Convert an ASCII letter to a bit-representation of Braille.
   */
  String toBraille(char letter) {
    return "";  // STUB
  } // toBraille(char)

  /**
   * Convert a bit-representation of Braille to ASCII letters.
   */
  String toAscii(String bits) {
    return "";  // STUB
  } // toAscii(String)

  /**
   * Convert a bit-representation of Braille to it's unicode representation.
   */
  String toUnicode(String bits) {
    return "";  // STUB
  } // toUnicode(String)
} // BrailleAsciiTables
