# 🚀 Codewars: Split Strings

A clean Java solution for the "Split Strings" challenge on Codewars.

## 📝 Problem Description

Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore (`'_'`).

**Examples:**
* `'abc'` => `['ab', 'c_']`
* `'abcdef'` => `['ab', 'cd', 'ef']`

* **Platform:** Codewars
* **Difficulty:** 6 kyu (Medium)
* **Topics:** Fundamentals, Strings, Regular Expressions, Arrays

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — Where $n$ is the length of the string `s`. The loop steps through the string 2 characters at a time ($n/2$ iterations), and `substring()` extracts 2-character slices in constant $O(1)$ time.
* **Space Complexity:** $O(n)$ — The `ArrayList` and the final `String[]` array both require linear space to store the $n/2$ string pairs.