# Codewars: Beginner - Lost Without a Map

A clean and optimal Java solution for doubling each integer in an array, featuring both an imperative index-based loop and a functional Java Streams approach.

## Problem Description

Given an array of integers, return a new array with each value doubled.

### Example:
* `[1, 2, 3]` ➔ **`[2, 4, 6]`**

* **Platform:** Codewars
* **Difficulty:** 8 kyu
* **Topics:** Fundamentals, Arrays, Algorithms

---

## Logic & Strategy

To transform the array by doubling its elements:
1. **Result Allocation:** Initialize a new integer array `result` with the exact same length as the input array `arr`.
2. **Sequential Iteration:** Loop through each index from `0` to `arr.length - 1`.
3. **Value Doubling:** Multiply each element at index `i` by `2` and assign it to the corresponding position in the `result` array.
4. **Return:** Output the newly populated array.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(N)$ — Where $N$ is the length of the input array. We traverse the array exactly once.
* **Space Complexity:** $\mathcal{O}(N)$ — We allocate a new output array of size $N$ to store the doubled values as required by the problem description.

---

## Alternative Approaches

### Solution 1: Standard Index Loop (Optimal & Clean)
Using an imperative `for` loop to populate a pre-allocated array:

```java
public class Maps {
  public static int[] map(int[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = arr[i] * 2;
    }
    return result;
  }
}