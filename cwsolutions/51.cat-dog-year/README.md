# 🚀 Codewars: Cat Years, Dog Years

A clean and optimal Python solution for converting human years to respective cat and dog years on CodHarika bir Python çözümü! İnsan yaşını kedi ve köpek yıllarına dönüştürme kuralını (`if` bloklarıyla ilk iki yılı ve sonraki yılları ayrı ayrı hesaplayarak) adım adım ve mantıklı bir şekilde kurmuşsun. 

Bu soru (Codewars'taki popüler **"Cat years, Dog years"** challenge'ı) için hazırladığım şablon uyumlu `README.md` içeriği:

```markdown
# 🚀 Codewars: Cat Years, Dog Years

A clean and optimal Python solution for converting human years into respective cat and dog years on Codewars.

---

## 📝 Problem Description

I have a cat and a dog. They get older at different rates compared to humans.

**Rules:**
- **Human Years 1:**
  - Cat Years = 15
  - Dog Years = 15
- **Human Years 2:**
  - Cat Years = 15 + 9 = 24
  - Dog Years = 15 + 9 = 24
- **Human Years 3+:**
  - Cat Years = 24 + (human_years - 2) * 4
  - Dog Years = 24 + (human_years - 2) * 5

Refactor/Write a function that takes all of this and returns a list/array containing `[human_years, cat_years, dog_years]`.

- **Platform:** Codewars
- **Difficulty:** 8 kyu (Easy)
- **Topics:** Fundamentals, Mathematics, Logic

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(1)$ — Constant time execution, involving only basic arithmetic operations and comparisons.
- **Space Complexity:** $O(1)$ — We allocate a fixed list containing three elements to return the result.

