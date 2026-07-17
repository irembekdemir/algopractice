# 🚀 Codewars: List Filtering

A clean Java solution for the "List Filtering" challenge on Codewars.

## 📝 Problem Description

In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

**Examples:**
* `filterList(List.of(1, 2, "a", "b"))` --> `[1, 2]`
* `filterList(List.of(1, "a", "b", 0, 15))` --> `[1, 0, 15]`
* `filterList(List.of(1, 2, "aasf", "1", "123", 123))` --> `[1, 2, 123]`

* **Platform:** Codewars
* **Difficulty:** 7 kyu (Easy)
* **Topics:** Fundamentals, Lists, Data Types, Filtering

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — Where $n$ is the number of elements in the input list. The loop visits every element exactly once, and the `instanceof` check along with adding to the `ArrayList` takes constant time $O(1)$.
* **Space Complexity:** $O(n)$ — In the worst-case scenario where the input list contains only integers, the `newList` will store all $n$ elements.
