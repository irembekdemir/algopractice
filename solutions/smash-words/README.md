# 🚀 Codewars: Sentence Smash

A clean and optimal Java solution for the **"Sentence Smash"** challenge on Codewars.

---

## 📝 Problem Description

The goal is to take an array of words, smash them together into a single sentence, and return it. The words should be separated by a single space, with **no** trailing or leading spaces.

- **Platform:** Codewars
- **Difficulty:** 8 kyu (Easy)
- **Topics:** Arrays, Strings, Loops

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(N)$ — Where $N$ is the total number of characters across all words. We iterate through the array once to concatenate the strings.
- **Space Complexity:** $O(N)$ — The memory allocated scales linearly with the total length of the combined output sentence.

---

## 💡 Alternative Approach (Java 8+) 
For a more production-ready and performant approach, String.join can be used to handle the interpolation automatically:

```java
public static String smash(String... words) {
    if (words == null) return "";
    return String.join(" ", words);
}
