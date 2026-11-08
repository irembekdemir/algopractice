# Codewars: Convert number to reversed array of digits (Digitize)

A clean and optimal C++ solution for converting a non-negative number into a vector of its digits in reverse order, featuring mathematical extraction and alternative approaches.

## Problem Description

Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

### Example:
* `35231` ➔ **`[1, 3, 2, 5, 3]`**
* `0` ➔ **`[0]`**

* **Platform:** Codewars
* **Difficulty:** 8 kyu
* **Topics:** Fundamentals, Mathematics, Algorithms, C++ Vectors

---

## Logic & Strategy

To extract and reverse the digits mathematically:
1. **Edge Case Handling:** If the input number `n` is `0`, immediately return a vector containing `{0}` since the loop would otherwise skip it.
2. **Vector Initialization:** Create an empty `std::vector<int>` to store the extracted digits.
3. **Digit Extraction Loop:** While `n > 0`:
   - Extract the last digit using the modulo operator (`n % 10`) and add it to the vector via `push_back()`.
   - Remove the last digit by integer dividing `n` by `10` (`n /= 10`).
4. **Return:** Output the populated vector containing the digits in reverse order.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(\log_{10} N)$ (or $\mathcal{O}(D)$ where $D$ is the number of digits) — The loop runs once for each digit in the number.
* **Space Complexity:** $\mathcal{O}(D)$ — We allocate a vector to store the resulting $D$ digits.

