# Codewars: Beginner Series #1 Cockroach

A clean and optimal Java solution for the "Beginner Series #1 Cockroach" challenge on Codewars.

## Problem Description

The cockroach is one of the fastest insects. Write a function which takes its speed in **km per hour** ($\text{km/h}$) and returns it in **cm per second** ($\text{cm/s}$), rounded down to the integer (`floored`).

### Example:
* Input: `1.08` ($\text{km/h}$) ➔ Output: **`30`** ($\text{cm/s}$)

* **Platform:** Codewars
* **Difficulty:** 8 kyu
* **Topics:** Fundamentals, Mathematics, Type Casting, Physics

---

## Mathematical Logic & Conversion

To convert kilometers per hour ($\text{km/h}$) to centimeters per second ($\text{cm/s}$):

1. **Kilometers to Centimeters:** $1 \text{ km} = 1,000 \text{ meters} = 100,000 \text{ cm}$
2. **Hours to Seconds:** $1 \text{ hour} = 60 \text{ minutes} = 3,600 \text{ seconds}$

Putting it together:

$$1 \text{ km/h} = \frac{100,000 \text{ cm}}{3,600 \text{ seconds}} = \frac{1,000}{36} \text{ cm/s} = \frac{250}{9} \text{ cm/s} \approx 27.7778 \text{ cm/s}$$

### Common Pitfalls in Java

1. **Integer Division:** Writing `1000 / 36` in Java uses integer division, which discards the decimal part and truncates the value to `27` instead of `27.7778...`. Using double literals like `1000.0 / 36.0` or floating-point multiplication ensures full precision.
2. **Operator Precedence in Casting:** Writing `(int) x * factor` only casts `x` to an `int` before multiplying, losing decimal precision (e.g., `1.08` becomes `1`). Enclosing the multiplication inside parentheses `(int) (x * factor)` ensures the full calculation is completed before rounding down.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(1)$ — Involves a single arithmetic multiplication and a type cast operation.
* **Space Complexity:** $\mathcal{O}(1)$ — No extra memory or data structures are allocated.

