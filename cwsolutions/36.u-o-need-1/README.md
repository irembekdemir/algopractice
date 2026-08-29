# Codewars: Check the exam / Array Element Check

A clean and optimal Java solution for checking if an array contains a specified element, implementing both imperative iteration and alternative approaches.

## Problem Description

Write a function that checks whether a provided array contains a particular value. 

The array can contain numbers or strings. X can be either. Return true if the array contains the value, false if not.

* **Platform:** Codewars
* **Difficulty:** 8 kyu
* **Topics:** Fundamentals, Arrays, Basic Algorithms

---

## Logic & Strategy

To verify the presence of an element in an array:
1. **Sequential Scan:** Iterate through each element of the array using a standard index-based loop.
2. **Equivalence Semantics:** Compare each array element against the target value `x` using `.equals()` to ensure proper value-based comparison rather than reference identity (`==`).
3. **Early Exit Optimization:** Return `true` immediately upon finding the first matching element.
4. **Fallback:** Return `false` if the loop completes without finding a match.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(N)$ — Where $N$ is the length of the array. In the worst case (element is absent or at the very end), we scan every element.
* **Space Complexity:** $\mathcal{O}(1)$ — The algorithm operates in auxiliary constant space.

---

## Alternative Approaches

### Solution 1: Standard Index Loop (Optimal & Clean)
Using an imperative `for` loop with `.equals()` comparison:

```java
public class Solution {
    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) return true;
        }
        return false;
    }
}