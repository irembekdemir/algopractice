# 🚀 Codewars: Sum of Two Squares

A clean and highly optimized Python solution for the "Sum of Two Squares" challenge on Codewars.

## 📝 Problem Description

Complete the function that takes a non-negative integer, and returns a list of non-negative integer pairs whose values - when squared - sum to the given integer.

Return the pairs in ascending order, so e.g. `[[0, 5], [3, 4]]` not `[[5, 0], [3, 4]]` or `[[3, 4], [0, 5]]`, etc.
If the given value cannot be expressed as the sum of two squares, return an empty array.

**Examples:**
* `25` --> `[[0, 5], [3, 4]]` (because $0^2 + 5^2 = 25$ and $3^2 + 4^2 = 25$)
* `1` --> `[[0, 1]]`
* `3` --> `[]`

*Note: The upper bound of the parameter value can be up to 2,147,483,647.*

* **Platform:** Codewars
* **Difficulty:** 7 kyu (Easy / Medium)
* **Topics:** Fundamentals, Mathematics, Two-Pointer Technique

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(\sqrt{n})$ — Instead of a brute-force $O(n)$ search, the search space is limited to the square root of $n$. The two-pointer approach checks each potential combination within this boundary at most once, which easily handles numbers up to $2 \times 10^9$ within milliseconds.
* **Space Complexity:** $O(k)$ — Where $k$ is the number of valid pairs found. Ignoring the output storage, the auxiliary space complexity is $O(1)$ since only a few integer pointers are maintained in memory.