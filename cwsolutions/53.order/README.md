# 🚀 Codewars: Can we get the stock?

A clean and optimal Python solution for checking store inventory and fulfilling product orders on Codewars.

---

## 📝 Problem Description

A retail store has a stock dictionary (`stock`) that maps merchandise names to their available quantities. 

You need to write a function `fillable(stock, merch, n)` that returns:
- `True` if there is enough of the given merchandise (`merch`) in stock to fulfill the order of `n` items.
- `False` otherwise (if the item doesn't exist in stock, the requested quantity is negative, or the stock is less than `n`).

For example:
- `stock = {'banana': 15, 'apple': 10}`
- `fillable(stock, 'banana', 5)` --> `True`
- `fillable(stock, 'banana', 20)` --> `False`
- `fillable(stock, 'orange', 1)` --> `False`

- **Platform:** Codewars
- **Difficulty:** 8 kyu (Easy)
- **Topics:** Dictionaries, Fundamentals, Logic, Conditional Statements

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(1)$ — Dictionary key lookup and numeric comparison operations take constant time on average.
- **Space Complexity:** $O(1)$ — No extra scaling memory is allocated.

