# Codewars: Sum Digits Raised to the Consecutive Powers (Eureka)

A clean and well-documented Python solution for the "Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....Eureka!!" challenge on Codewars, exploring both string-based mapping and mathematical digit extraction techniques.

## Problem Description

The number **89** is the first integer with more than one digit that fulfills a unique property: its digits raised to their respective 1-based sequential powers equal the number itself. 

For example:
$$89 = 8^1 + 9^2$$

The next number with this property is **135**:
$$135 = 1^1 + 3^2 + 5^3$$

Task: We need a function to collect these numbers that receives two integers $a$ and $b$ defining the inclusive range $[a, b]$, and outputs a list of sorted numbers within that range that fulfill this property.

### Examples:
* `sum_dig_pow(1, 10)` ➔ **`[1, 2, 3, 4, 5, 6, 7, 8, 9]`**
* `sum_dig_pow(1, 100)` ➔ **`[1, 2, 3, 4, 5, 6, 7, 8, 9, 89]`**
* `sum_dig_pow(90, 150)` ➔ **`[135]`**

* **Platform:** Codewars
* **Difficulty:** 6 kyu
* **Topics:** Mathematics, Fundamentals, Algorithms

---

## Logic & Strategy

To verify if a number matches the Eureka property:
1. **Range Traversal:** Loop through every integer from $a$ to $b$ inclusive.
2. **Digit Breakdown:** 
   - **Approach A (String Conversion):** Convert the number to a string to easily map through its characters alongside their 1-based index positions.
   - **Approach B (Mathematical Modulo):** Repeatedly extract the rightmost digit using modulo (`% 10`) and shrink the number using integer division (`// 10`), then reverse the extracted list.
3. **Power Summation:** Raise each digit to the power of its position index + 1 ($d^{\text{index} + 1}$) and accumulate the sum.
4. **Validation:** If the computed sum matches the original number, append it to the result list.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}((b - a) \times d)$ — Where $(b - a)$ is the size of the range and $d$ is the average number of digits per integer. Since digits scale logarithmically with the number magnitude, execution is fast.
* **Space Complexity:** $\mathcal{O}(d)$ — Temporary memory is used to store digits or string representations for each evaluated number.

---

## Python Solutions

### Solution 1: Mathematical Approach (No Strings)
```python
def sum_dig_pow(a, b):
    result = []
    for num in range(a, b + 1):
        temp = num
        digits = []
        
        # Extract digits from right to left using modulo and integer division
        while temp > 0:
            digits.append(temp % 10)
            temp //= 10  # Integer division: removes the last digit
            
        # Reverse because modulo extracts digits in reverse order (right-to-left)
        digits.reverse()
        
        # Calculate power sum
        total = sum(d ** (idx + 1) for idx, d in enumerate(digits))
        
        if total == num:
            result.append(num)
            
    return result