package edu.grinnell.csc207.main;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.BrailleAsciiTables;

/**
 * The BrailleASCII Program.
 * @author Andrew Fargo
 */
public class BrailleASCII {
  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Entrypoint of the BrailleASCII program.
   * @param args The first argument is the target format (braille, ascii, unicode).
   * The second argument is the input (ascii, braille).
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    try {
      if (args.length != 2) {
        throw new Exception("Invalid number of arguments supplied.");
      } // if

      // From Braille we can get to anything, so let's convert there.
      String brailleString = "";
      if (args[1].matches("[ a-zA-Z]+")) {
        for (char c : args[1].toCharArray()) {
          brailleString += BrailleAsciiTables.toBraille(c);
        } // for
      } else {
        brailleString = args[1];
      } // if/else

      String result = "";
      // Find and convert to the type we want.
      if (args[0].equals("braille")) {
        result = brailleString;
      } else if (args[0].equals("ascii")) {
        result = BrailleAsciiTables.toAscii(brailleString);
      } else if (args[0].equals("unicode")) {
        result = BrailleAsciiTables.toUnicode(brailleString);
      } else {
        throw new Exception("Unrecognized format type: " + args[1]);
      } // if/else

      pen.println(result);
    } catch (Exception e) {
      pen.println(e.getMessage());
    } finally {
      pen.close();
    } // try/catch/finally
  } // main(String[])
} // class BrailleASCII
