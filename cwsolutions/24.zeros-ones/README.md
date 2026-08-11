# 🚀 Codewars: Ones and Zeros

A clean and intuitive Java solution for converting a binary array representation to an equivalent decimal integer.

## 📝 Problem Description

Given an array of ones and zeroes, convert the equivalent binary value to an integer.

For example:
* `[0, 0, 0, 1]` is treated as `0001` which is the binary representation of **1**.
* `[0, 0, 1, 0]` is treated as `0010` which is the binary representation of **2**.
* `[0, 1, 0, 1]` is treated as `0101` which is the binary representation of **5**.
* `[1, 0, 0, 1]` is treated as `1001` which is the binary representation of **9**.

* **Platform:** Codewars
* **Difficulty:** 7 kyu
* **Topics:** Fundamentals, Arrays, Mathematics, Binary

---

## 📐 Mathematical Logic

Binary numbers are base-2 positional values. Each position in the binary sequence represents a power of 2, starting from $2^0$ on the far right and increasing leftward.

For an array of size $N$, the element at index $i$ corresponds to the weight:

$$2^{(N - 1 - i)}$$

### Example Walkthrough (`[1, 0, 1, 1]`):
- Index 0: $1 \times 2^{4-1-0} = 1 \times 2^3 = 8$
- Index 1: $0 \times 2^{4-1-1} = 0 \times 2^2 = 0$
- Index 2: $1 \times 2^{4-1-2} = 1 \times 2^1 = 2$
- Index 3: $1 \times 2^{4-1-3} = 1 \times 2^0 = 1$

$$\text{Total Sum} = 8 + 0 + 2 + 1 = 11$$

---

## 🛠️ Complexity Analysis

* **Time Complexity:** $\mathcal{O}(N)$ — The solution iterates through the list of size $N$ exactly once.
* **Space Complexity:** $\mathcal{O}(1)$ — Operates in constant extra space, maintaining only a single accumulator variable.

---

## 💡 Code Implementations

### ☕ Provided Java Solution (Mathematical Approach)

```java
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int answer = 0;
        for (int i = 0; i < binary.size(); i++) {
            answer += binary.get(i) * Math.pow(2, binary.size() - i - 1);
        }
        return answer;
    }
}