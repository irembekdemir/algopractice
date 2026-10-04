# Codewars: Return Negative

A clean, highly efficient C++ solution for the "Return Negative" challenge on Codewars, utilizing a concise ternary conditional operator for optimal performance.

## Problem Description

In this simple assignment, you are given a number and have to make it negative. But what if the number is already negative?

* **Rules:**
  * The input number can be positive, negative, or zero.
  * If the number is positive, it should be converted to negative.
  * If the number is already negative, it should remain unchanged.
  * Zero (`0`) should remain `0`.

### Examples:
* `makeNegative(1)` ➔ **`-1`**
* `makeNegative(-5)` ➔ **`-5`**
* `makeNegative(0)` ➔ **`0`**
* `makeNegative(42)` ➔ **`-42`**

* **Platform:** Codewars
* **Difficulty:** 8 kyu
* **Topics:** Fundamentals, Algorithms, Mathematics

## Alternative Approach
```cpp
#include  

int makeNegative(int num) {
    return -std::abs(num);
}
```