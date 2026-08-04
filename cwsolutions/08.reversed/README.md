# 🚀 Codewars: Reversed Strings

A clean Java solution for the "Reversed Strings" challenge on Codewars.

## 📝 Problem Description

Complete the solution so that it reverses the string passed into it.

**Examples (Input --> Output):**
* `"world" --> "dlrow"`
* `"word" --> "drow"`
* `"java" --> "avaj"`

* **Platform:** Codewars
* **Difficulty:** 8 kyu (Easy)
* **Topics:** Fundamentals, Strings, Loops, StringBuilder

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — We iterate through half of the string length ($n/2$) to swap characters, which scales linearly with the size of the input string.
* **Space Complexity:** $O(n)$ — A `StringBuilder` object is instantiated to modify characters, requiring memory proportional to the length of the input string.

