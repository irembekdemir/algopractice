# Codewars: Build Tower

A clean, optimal, and multi-language solution for the "Build Tower" challenge on Codewars.

## Problem Description

Build a pyramid-shaped tower, as an array/list of strings, given a positive integer `n_floors` (number of floors). A tower block is represented with the `"*"` character.

For example, a tower with `3` floors looks like this:

```text
[
  "  *  ",
  " *** ", 
  "*****"
]
```
* **Platform:** Codewars
* **Difficulty:** 6 kyu
* **Topics:** Fundamentals, Strings, Arrays, Formatting

---

## 📐 Mathematical Pattern & Logic

To construct each floor $i$ (from $1$ to $n$):

1. **Total Width:** The width of the base (and every string) is $2n - 1$.
2. **Stars per Floor:** The $i$-th floor contains $2i - 1$ stars.
3. **Padding Spaces:** Each side (left and right) is padded with $n - i$ spaces.

$$\text{Floor}_i = \text{Spaces}(n - i) + \text{Stars}(2i - 1) + \text{Spaces}(n - i)$$

---

## 🛠️ Complexity Analysis

* **Time Complexity:** $\mathcal{O}(n^2)$ — Creating each floor string requires $\mathcal{O}(n)$ time due to string repetition and concatenation across $n$ floors.
* **Space Complexity:** $\mathcal{O}(n^2)$ — Total characters stored in the output array equal the sum of string lengths across all $n$ floors.

