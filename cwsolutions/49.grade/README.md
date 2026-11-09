# 🚀 Codewars: Student's Final Grade

A clean and optimal Python solution for calculating a student's final grade based on exam score and completed projects on Codewars.

---

## 📝 Problem Description

Create a function `final_grade`, which calculates the final grade of a student depending on two parameters: a grade for the exam and the number of completed projects.

This function should take two arguments: `exam` (integer from 0 to 100) and `projects` (integer from 0 upwards).

The function should return a number (final grade):
- **100** if the exam is greater than 90 or if the number of projects is greater than 10.
- **90** if the exam is greater than 75 and the number of projects is at least 5.
- **75** if the exam is greater than 50 and the number of projects is at least 2.
- **0** in all other cases.

- **Platform:** Codewars
- **Difficulty:** 8 kyu (Easy)
- **Topics:** Fundamentals, Conditional Statements, Logic

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(1)$ — Constant time execution, as it only evaluates a fixed number of conditional comparisons.
- **Space Complexity:** $O(1)$ — No extra scaling memory is allocated; only primitive values are evaluated.

