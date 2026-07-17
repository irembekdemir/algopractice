# 🚀 Codewars: Printer Errors

A clean Java solution for the "Printer Errors" challenge on Codewars.

## 📝 Problem Description

In a factory, a printer prints labels for boxes. For one kind of boxes, the printer has to use colors which, for the sake of simplicity, are named with letters from `a` to `m`.

The colors used by the printer are recorded in a control string. For example a "good" control string would be `aaabbbbhaijjjm` meaning that the printer used three times color a, four times color b, one time color h then one time color a...

Sometimes there are problems: lack of colors, technical malfunctions and a "bad" control string is produced e.g. `aaaxbbbbyyhwawiwjjjwwm` with letters not from `a` to `m`.

Your task is to write a function `printerError` which will return the error rate of the printer as a **string** representing a rational whose numerator is the number of errors and the denominator the total length of the control string. Don't reduce the fraction.

**Examples:**
* `s="aaabbbbhaijjjm"` -> `printerError(s) => "0/14"`
* `s="aaaxbbbbyyhwawiwjjjwwm"` -> `printerError(s) => "8/22"`

* **Platform:** Codewars
* **Difficulty:** 7 kyu (Easy)
* **Topics:** Fundamentals, Strings, Conditional Statements

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — Where $n$ is the length of the string `s`. The code converts the string to a character array and iterates through each character exactly once to check if it's an error.
* **Space Complexity:** $O(n)$ — `s.toCharArray()` creates a new character array of size $n$ in memory to perform the iteration.
