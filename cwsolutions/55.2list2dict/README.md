# 🚀 Codewars: Create Dict (Zip Lists into Dictionary)

A clean and optimal Python solution for mapping two lists into a dictionary with default padding values on Codewars.

---

## 📝 Problem Description

There are two arrays (`keys` and `values`). Write a function that takes both of them and builds a dictionary where the elements of the first array are the keys and the elements of the second array are the corresponding values.

- If the first array (`keys`) has more elements than the second array (`values`), the missing values should be set to `None`.
- If the second array (`values`) has more elements, the extra values should be ignored (since keys dictate dictionary mappings).

For example:
- `keys = ['a', 'b', 'c']`, `values = [1, 2, 3]` -> `{'a': 1, 'b': 2, 'c': 3}`
- `keys = ['a', 'b', 'c']`, `values = [1, 2]` -> `{'a': 1, 'b': 2, 'c': None}`

- **Platform:** Codewars
- **Difficulty:** 7 kyu (Easy / Medium)
- **Topics:** Dictionaries, Lists, Iteration, Logic

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(N)$ — Where $N$ is the number of elements processed up to the maximum index or length of keys, iterating linearly through the lists.
- **Space Complexity:** $O(N)$ — We allocate a new dictionary of size $N$ to store the key-value mappings.

