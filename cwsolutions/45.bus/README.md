# 🚀 Codewars: Will There Be Enough Space?

A clean and optimal Python solution for calculating passenger capacity on a bus on Codewars.

---

## 📝 Problem Description

You have to write a function that accepts 3 parameters:
- `cap` is the amount of people the bus can hold excluding the driver.
- `on` is the number of people on the bus excluding the driver.
- `wait` is the number of people waiting to get on to the bus.

If there is enough space, return `0`, and if there isn't, return the **exact number of passengers that can't fit**.

For example:
- `cap = 10`, `on = 5`, `wait = 5` --> `0` (Bus is full, but everyone fits)
- `cap = 100`, `on = 60`, `wait = 50` --> `10` (10 people can't fit)

- **Platform:** Codewars
- **Difficulty:** 8 kyu (Easy)
- **Topics:** Fundamentals, Mathematics, Logic

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(1)$ — Basic arithmetic operations take constant time.
- **Space Complexity:** $O(1)$ — Only a few primitive variables are used, requiring no extra scaling memory.

