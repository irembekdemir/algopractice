# 🚀 Codewars: Unused Digits

A clean and optimal Python solution for finding missing digits across multiple numbers on Codewars.

---

## 📝 Problem Description

Given a list of integers, find the digits that are not present in any of the numbers.

The result should be a string containing the missing digits in ascending order (from `0` to `9`).

For example:
- `unused_digits(12, 34, 56, 78)` -> `"09"`
- `unused_digits(2015, 8, 26)` -> `"3479"`

- **Platform:** Codewars
- **Difficulty:** 7 kyu (Easy / Medium)
- **Topics:** Strings, Algorithms, Fundamentals

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(N)$ — Where $N$ is the total number of digits across all passed integers. We iterate through the numbers to extract digits and check against a fixed 10-digit set.
- **Space Complexity:** $O(1)$ — The reference pool and return string are strictly bounded to at most 10 characters.

