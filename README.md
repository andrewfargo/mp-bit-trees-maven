# mp-bit-trees-maven

A mini-project exploring bit trees (a form of binary tree) and their use in translating between alphabets, particularly in translating to and from braille.

**Authors**

* Andrew Fargo
* Samuel A. Rebelsky (starter code)

**Acknowledgements**

* Java's Regex syntax, as well as many String convience methods were taken from the Java 17 Documentation: <https://docs.oracle.com/en/java/javase/17/docs/api/index.html>
* The method of converting a hex-representation to unicode was explored in class 25 of CSC-207-02: <https://rebelsky.cs.grinnell.edu/Courses/CSC207/2024Fa/eboards/eboard25-2.html>
* Significant guidance was taken from the project-specification: <https://rebelsky.cs.grinnell.edu/Courses/CSC207/2024Fa/mps/mp10.html>

**Instructions for use**

The main entry point of the program is the class `edu.grinnell.csc207.main.BrailleAscii`.
Running the converter requires two command arguments, in this order:

1. A conversion target (one of `braille`, `ascii`, or `unicode`)
2. Valid Braille or ASCII input strings. For ASCII, this string may be enclosed in quotes
to include spaces.

It is valid to convert ASCII to itself and Braille to itself, expecting artefacts from the former.

A braille character is represented by 6 bits, indicating "raised" or "not-raised" starting from the upper left,
moving downwards the first column of three, then the upper right moving downwards the second column of three.

Braille input and output must be divisible by 6 thus.

Numbers or special characters are not considered valid for braille conversion. 
Only strings matching the regular expression `[ a-zA-Z]+` are valid.

---

This code may be found at <https://github.com/andrewfargo/mp-bit-trees-maven>. The original code may be found at <https://github.com/Grinnell-CSC207/mp-bit-trees-maven>.
