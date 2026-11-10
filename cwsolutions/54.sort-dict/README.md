# 🚀 Codewars: Sort the Vowel sequence / Dictionary Sorting

A clean and optimal Python solution for sorting a dictionary by its values in descending order on Codewars.

---

## 📝 Problem Description

Python dictionaries are inherently unsorted. So what do you do if you need to sort the contents of a dictionary?

Create a function that returns a sorted list of `(key, value)` tuples. The list must be sorted by the **value** and be sorted **largest to smallest**.

For example:
- `sort_dict({3:1, 2:2, 1:3})` == `[(1,3), (2,2), (3,1)]`
- `sort_dict({1:2, 2:4, 3:6})` == `[(3,6), (2,4), (1,2)]`

- **Platform:** Codewars
- **Difficulty:** 7 kyu (Easy / Medium)
- **Topics:** Dictionaries, Sorting, Algorithms, Fundamentals

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(N \log N)$ — Where $N$ is the number of key-value pairs in the dictionary. Sorting operations in Python (`Timsort`) run in $O(N \log N)$ time.
- **Space Complexity:** $O(N)$ — We allocate a new list containing the dictionary items to store and return the sorted result.

---

## Alternatie Solution

```python
from operator import itemgetter

def sort_dict(d):
    return sorted(d.items(), key=itemgetter(1), reverse=True)
```
---
```python
def get_value(item):
    return item[1]

def sort_dict(d):
    return sorted(d.items(), key=get_value, reverse=True)