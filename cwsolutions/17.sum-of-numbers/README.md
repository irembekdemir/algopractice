# 🚀 Codewars: Beginner Series #3 Sum of Numbers

A clean Java solution for the "Beginner Series #3 Sum of Numbers" challenge on Codewars.

## 📝 Problem Description

Given two integers `a` and `b`, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return `a` or `b`.

*Note: `a` and `b` are not ordered!*

**Examples (a, b --> Output):**
* `(1, 0) --> 1` (1 + 0 = 1)
* `(1, 2) --> 3` (1 + 2 = 3)
* `(0, 1) --> 1` (0 + 1 = 1)
* `(1, 1) --> 1` (1 since both are equal)
* `(-1, 2) --> 2` (-1 + 0 + 1 + 2 = 2)

* **Platform:** Codewars
* **Difficulty:** 7 kyu (Easy)
* **Topics:** Fundamentals, Mathematics, Loops

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — Where $n$ is the absolute difference between `a` and `b` plus one ($|a - b| + 1$). The loop runs sequentially from the minimum value to the maximum value.
* **Space Complexity:** $O(1)$ — The algorithm only uses a few primitive integer variables (`answer`, `left`, `right`, and `i`) to compute the sum, maintaining constant memory overhead.

## Alternative Approach

```java
public class Sum
{
  public int GetSum(int a, int b)
  {
    return (a + b) * (Math.abs(a - b) + 1) / 2;  //1+2+3...+n = n(n+1)/2 formula :d
  }
}
```