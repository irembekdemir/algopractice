# 🚀 Codewars: What Is Between?

A clean and optimal Python solution for generating a sequence of numbers between two given integers on Codewars.

---

## 📝 Problem Description

Complete the function that takes two integers (`a`, `b`, where `a` < `b`) and return an array of all integers between the input parameters, including them.

For example:
- `a = 1`, `b = 4` --> `[1, 2, 3, 4]`
- `a = -2`, `b = 2` --> `[-2, -1, 0, 1, 2]`

- **Platform:** Codewars
- **Difficulty:** 8 kyu (Easy)
- **Topics:** Algorithms, Arrays, Ranges

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(B - A)$ — Where $N$ is the number of elements between $a$ and $b$ (inclusive). We iterate through each integer in the range once and append it to the list.
- **Space Complexity:** $O(B - A)$ — We allocate memory to store the resulting list containing all integers from $a$ to $b$.
