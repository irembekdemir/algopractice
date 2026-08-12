# Codewars: The Highest Profit Wins!

A clean and optimal solution in Java, Python, and JavaScript for "The Highest Profit Wins!" challenge on Codewars.

## Problem Description

Ben has a very simple idea to make some profit: he buys something and sells it again. To maximize his profit, he buys at the lowest possible price and sells at the highest.

Write a function that returns both the **minimum** and **maximum** number of the given list/array.

### Examples:
* `[1, 2, 3, 4, 5]` ➔ `[1, 5]`
* `[2334454, 5]` ➔ `[5, 2334454]`
* `[1]` ➔ `[1, 1]`

* **Platform:** Codewars
* **Difficulty:** 7 kyu
* **Topics:** Fundamentals, Arrays, Mathematics, Searching

---

## Logic & Algorithm

1. **Initialization:** Set both `min` and `max` variables to the first element of the array (`arr[0]`).
2. **Linear Scan:** Iterate through each element in the array:
   - If the current element is smaller than `min`, update `min`.
   - If the current element is larger than `max`, update `max`.
3. **Return:** Form a new two-element array `[min, max]` and return it.

---

## 🛠️ Complexity Analysis

* **Time Complexity:** $\mathcal{O}(n)$ — We inspect each of the $n$ elements in the array exactly once.
* **Space Complexity:** $\mathcal{O}(1)$ — Only constant additional space is used to store the `min` and `max` pointers.
