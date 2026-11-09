# 🚀 Codewars: Total Amount of Points

A clean and optimal Python solution for calculating a football team's total championship points on Codewars.

---

## 📝 Problem Description

Our football team has completed the championship. Our match results are recorded in a collection of strings. Each match is represented by a string in the format `"x:y"`, where `x` is our team's score and `y` is our opponent's score.

For example: `["3:1", "2:2", "0:1", ...]`

Points are awarded for each match as follows:
- if x > y: 3 points (win)
- if x < y: 0 points (loss)
- if x = y: 1 point (tie)

We need to write a function that takes this collection and returns the number of points our team (`x`) has won in the championship.

- **Platform:** Codewars
- **Difficulty:** 8 kyu (Easy)
- **Topics:** Fundamentals, Arrays, Strings, Mathematics

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(N)$ — Where $N$ is the number of games in the list. We iterate through each match score string once.
- **Space Complexity:** $O(1)$ — We only maintain an integer variable (`points`) to accumulate the score, requiring constant extra space.

