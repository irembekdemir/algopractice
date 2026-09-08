# Codewars: Sum of the first nth term of a Series

A clean and well-documented Java solution for the "Sum of the first nth term of a Series" challenge on Codewars, featuring safe loop boundaries, explicit floating-point handling, and precise decimal formatting.

## Problem Description

Your task is to write a function that returns the sum of the following series up to the nth term (parameter `n`), rounded to 2 decimal places.

$$\text{Series: } 1 + \frac{1}{4} + \frac{1}{7} + \frac{1}{10} + \frac{1}{13} + \frac{1}{16} + \dots$$

* Rules:
  * Return the answer as a string with 2 decimal places.
  * If the given value is `0`, then it should return `"0.00"`.
  * The parameter `n` will always be greater than or equal to $0$.

### Examples:
* `seriesSum(1)` ➔ **`"1.00"`**
* `seriesSum(2)` ➔ **`"1.25"`** ($1 + 1/4$)
* `seriesSum(5)` ➔ **`"1.57"`** ($1 + 1/4 + 1/7 + 1/10 + 1/13$)

* **Platform:** Codewars
* **Difficulty:** 7 kyu
* **Topics:** Mathematics, Fundamentals, Algorithms, Formatting

---

## Logic & Strategy

To compute the series sum accurately in Java:
1. **Edge Case Check:** If $n = 0$, immediately return `"0.00"` to avoid unnecessary execution.
2. **Initialization:** Set `result = 0` and define the starting denominator (`bottom = 1`).
3. **Loop Traversal:** Iterate exactly $n$ times using a standard `for` loop (`i < n`).
4. **Term Accumulation:** 
   - For the first iteration ($i = 0$), add `1.0` directly to the result.
   - For subsequent iterations ($i > 0$), increment the denominator by $3$ (`bottom += 3.0`) and add the fraction `1.0 / bottom` to prevent integer division truncations.
5. **Decimal Formatting:** Use `DecimalFormat` to enforce a clean, fixed-point string representation rounded to two decimal places.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(n)$ — The loop executes precisely $n$ times, scaling linearly with the input size.
* **Space Complexity:** $\mathcal{O}(1)$ — Uses a fixed amount of auxiliary memory for primitive variables and the format object.
