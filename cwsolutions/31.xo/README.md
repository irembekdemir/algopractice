# Codewars: Exes and Ohs

A clean and optimal Java solution for the "Exes and Ohs" challenge on Codewars.

## Problem Description

Check to see if a string has the same amount of `'x'`s and `'o'`s. The method must return a boolean and be **case insensitive**. The string can contain any char.

### Examples:
* `XO("ooxx")` ➔ `true`
* `XO("xooxx")` ➔ `false`
* `XO("ooxXm")` ➔ `true` (Case insensitive)
* `XO("zpzpzpp")` ➔ `true` (When no `'x'` and `'o'` are present, `0 == 0` is `true`)
* `XO("zzoo")` ➔ `false`

* **Platform:** Codewars
* **Difficulty:** 7 kyu
* **Topics:** Fundamentals, Strings, Counting, Case Insensitivity

---

## Logic & Algorithm

1. **Counters:** Maintain two separate counters, `xCount` and `oCount`, initialized to `0`.
2. **Iterate:** Loop through each character of the input string.
3. **Case-Insensitive Check:** Check if the current character matches `'x'`/`'X'` or `'o'`/`'O'` and increment the corresponding counter.
4. **Compare:** Return `true` if `xCount == oCount`, otherwise return `false`.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(n)$ — Single pass over the string of length $n$.
* **Space Complexity:** $\mathcal{O}(1)$ — Operates using constant extra space for counter variables.

