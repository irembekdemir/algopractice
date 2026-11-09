# 🚀 Codewars: Categorize New Member

A clean and optimal Python solution for categorizing club members into 'Senior' or 'Open' based on age and handicap on Codewars.

---

## 📝 Problem Description

The Western Suburbs Croquet Club has two categories of membership, Senior and Open. They would like your help with an application form that will tell prospective members which category they will be placed.

To be a senior, a member must be at least 55 years old and have a handicap greater than 7. In this croquet club, handicaps range from -2 to +26; the better the player the lower the handicap.

Input will consist of a list of pairs. Each pair contains information for a single potential member. Information consists of an integer for age and an integer for the handicap.

For example: `[[18, 20], [45, 2], [61, 12], [37, 6], [21, 21], [78, 9]]`
Output: `["Open", "Open", "Senior", "Open", "Open", "Senior"]`

- **Platform:** Codewars
- **Difficulty:** 7 kyu (Easy / Medium)
- **Topics:** Lists, Fundamentals, Logic

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(N)$ — Where $N$ is the number of members in the input list. We iterate through each sub-list (pair) once.
- **Space Complexity:** $O(N)$ — We allocate a new `result` list of size $N$ to store the category string for each member.

