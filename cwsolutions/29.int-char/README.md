# Codewars: Parse nice int from char problem

A clean and optimal Java solution for the "Parse nice int from char problem" challenge on Codewars.

## Problem Description

You ask a small girl, "How old are you?" She always says, "x years old", where x is a random number between 0 and 9.

Write a program that returns the girl's age (0-9) as an integer.

Assume the test input string is always a valid string. For example, the test input may be `"1 year old"` or `"5 years old"`. The first character in the string is always a number.

* **Platform:** Codewars
* **Difficulty:** 8 kyu
* **Topics:** Fundamentals, Strings, Type Conversion, Parsing

---

## Logic & Algorithm

The problem guarantees that the age is always a single digit ($0-9$) and is always located at the very beginning of the string (index `0`).

**The Trap (ASCII Values):** 
Extracting the first character using `charAt(0)` returns a `char`. If you try to directly return a `char` as an `int`, Java returns its underlying ASCII/Unicode decimal value (e.g., `'5'` becomes `53`), not the actual numeric value.

**The Solution:**
Extract the first character and properly convert it from a `char` to an `int` using character arithmetic or built-in Java methods.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(1)$ — The operation extracts exactly one character from the first position and converts it, which runs in constant time.
* **Space Complexity:** $\mathcal{O}(1)$ — No extra data structures are created; it operates with minimal memory.

