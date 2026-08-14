# Codewars: Detect Pangram

A clean and optimal Java solution for the "Detect Pangram" challenge on Codewars, featuring both imperative loops and functional Java Streams approaches.

## Problem Description

A **pangram** is a sentence that contains every single letter of the alphabet at least once. For example, the sentence *"The quick brown fox jumps over the lazy dog"* is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return `true` if it is, `false` if not. Ignore numbers and punctuation.

### Examples:
* `"The quick brown fox jumps over the lazy dog."` ➔ **`true`**
* `"You shall not pass!"` ➔ **`false`**
* `"Cwm fjord bank glyphs vext quiz"` ➔ **`true`**

* **Platform:** Codewars
* **Difficulty:** 6 kyu
* **Topics:** Fundamentals, Strings, Data Structures, Streams

---

## Logic & Strategy

To verify if a sentence is a pangram:
1. **Case-Insensitivity:** Convert the entire string to lowercase so `'A'` and `'a'` are treated identically.
2. **Character Filtering:** Focus strictly on alphabetic characters (`'a'` to `'z'`), ignoring punctuation, digits, and spaces.
3. **Completeness Check:**
   - **Approach A (Alphabet Iteration):** Loop through every character from `'a'` to `'z'`. If any single character is missing from the sentence, immediately return `false`. If all 26 are found, return `true`.
   - **Approach B (Distinct Count via Streams):** Filter out non-letters, extract distinct characters, and check if the unique letter count equals **26**.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(n)$ — Where $n$ is the length of the string. We perform a single pass over the string characters.
* **Space Complexity:** $\mathcal{O}(1)$ — The size of the alphabet is constant ($26$ letters), requiring fixed space regardless of input length.

---

## Alternative Approach

### Solution 2: Java Streams (Functional & One-Liner)
Using modern Java Stream API to count distinct letters:

```java
public class PangramChecker {

    public boolean check(String sentence) {
        return sentence.toLowerCase()
                       .chars() // IntStream of character codes
                       .filter(Character::isLetter) // Filter out spaces/punctuation
                       .distinct() // Keep unique characters only
                       .count() == 26; // Check if total unique letters equal 26
    }
}
```

### Solution 3: Using HashSet
Collecting unique letters into a Set data structure:

```java
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean check(String sentence) {
        Set<Character> letters = new HashSet<>();

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        return letters.size() == 26;
    }
}
```
