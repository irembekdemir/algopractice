# 🚀 Codewars: Correct the mistakes of the character recognition software

A clean and optimal Python solution for fixing OCR recognition errors on Codewars.

---

## 📝 Problem Description

Character recognition software often introduces errors: text is scanned, but sometimes numbers are mistakenly recognized as letters.

Your task is to correct the errors in the given string:
- `5` is mistaken for `S`
- `0` is mistaken for `O`
- `1` is mistaken for `I`

For example: `"L0ND0N"` -> `"LONDON"`

- **Platform:** Codewars
- **Difficulty:** 8 kyu (Easy)
- **Topics:** Strings, Fundamentals, Regular Expressions

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(N)$ — Where $N$ is the length of the string. Built-in string methods like `.replace()` are implemented in optimized C under the hood.
- **Space Complexity:** $O(N)$ — A new modified string is returned as strings are immutable in Python.

