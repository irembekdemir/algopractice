# 🚀 Codewars: Scrabble Score

A clean and optimal Python solution for calculating the Scrabble score of a given word on Codewars.

---

## 📝 Problem Description

Write a function that accepts a word and returns the Scrabble score of that word.

- Letter values are mapped according to standard Scrabble rules.
- The input may contain spaces or mixed-case letters, which should be properly handled.
- If the word is empty or contains only non-scoring characters, the score should be `0`.

For example:
- `"cab"` -> `3 + 1 + 3 = 7`

- **Platform:** Codewars
- **Difficulty:** 7 kyu (Easy / Medium)
- **Topics:** Dictionaries, Strings, Fundamentals

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(N)$ — Where $N$ is the length of the string. We iterate through each character of the word once.
- **Space Complexity:** $O(1)$ — The score dictionary has a fixed size (26 letters), using constant extra space.

---

## 💻 Python Solution

```python
def scrabble_score(st):
    dict_scores = {
        "A": 1, "B": 3, "C": 3, "D": 2, "E": 1, "F": 4, "G": 2, "H": 4, 
        "I": 1, "J": 8, "K": 5, "L": 1, "M": 3, "N": 1, "O": 1, "P": 3, 
        "Q": 10, "R": 1, "S": 1, "T": 1, "U": 1, "V": 4, "W": 4, "X": 8, 
        "Y": 4, "Z": 10
    }
    
    score = 0
    for char in st.upper():
        if char in dict_scores:
            score += dict_scores[char]
            
    return score