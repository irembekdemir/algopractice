#   Codewars: Beginner - Reduce but Grow

A clean and optimal Java solution for the "Beginner - Reduce but Grow" challenge on Codewars.

## Problem Description

Given a non-empty array of integers, return the result of multiplying the values together in order.

### Examples:
* `[1, 2, 3, 4]` ➔ $1 \times 2 \times 3 \times 4 = \mathbf{24}$
* `[4, 1, 1, 1]` ➔ $4 \times 1 \times 1 \times 1 = \mathbf{4}$
* `[2, 2, 2, 2, 2, 2]` ➔ $2 \times 2 \times 2 \times 2 \times 2 \times 2 = \mathbf{64}$

* **Platform:** Codewars
* **Difficulty:** 8 kyu
* **Topics:** Fundamentals, Arrays, Mathematics

---

## Logic & Algorithm

1. **Accumulator Initialization:** Initialize an `answer` variable to `1` (since $1$ is the multiplicative identity).
2. **Sequential Multiplication:** Iterate through each integer in the array using an enhanced `for` loop and multiply it into `answer`.
3. **Return Output:** Return the accumulated product.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(n)$ — Single pass over the array of length $n$.
* **Space Complexity:** $\mathcal{O}(1)$ — Operates using a single primitive integer in constant memory.

---

## Alternative Approach

```java
import java.util.Arrays;

public class Kata {

    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }
}
```