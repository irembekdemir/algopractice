# 🚀 Codewars: Is This a Triangle?

A clean and optimal Python solution for checking if three given side lengths can form a triangle on Codewars.

---

## 📝 Problem Description

Implement a function that accepts 3 integer values `a`, `b`, and `c`. The function should return `true` if a triangle can be built with the given sides of a given length, and `false` otherwise.

(Note: In geometry, all triangles formed must have positive sides greater than 0, and the sum of any two sides must be strictly greater than the third side).

- **Platform:** Codewars
- **Difficulty:** 7 kyu (Easy / Medium)
- **Topics:** Mathematics, Geometry, Fundamentals

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(1)$ — Basic mathematical comparisons execute in constant time.
- **Space Complexity:** $O(1)$ — No extra data structures or scaling memory allocations are used.

---

## 💻 Python Solution (Corrected & Robust)

To ensure all side combinations are checked properly and handle order-independent triangle inequalities:

```python
def is_triangle(a, b, c):
    # The sum of any two sides must be strictly greater than the third side
    return (a + b > c) and (a + c > b) and (b + c > a)