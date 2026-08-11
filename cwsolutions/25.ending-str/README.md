# 🚀 Codewars: String Ends With?

A clean and optimal Java solution for the "String Ends With?" challenge on Codewars.

## 📝 Problem Description

Complete the solution so that it returns `true` if the first argument (string) passed in ends with the 2nd argument (also a string).

### Examples:
* `solution("abc", "bc")` ➔ `true`
* `solution("abc", "d")` ➔ `false`
* `solution("samurai", "ai")` ➔ `true`
* `solution("fails", "ailles")` ➔ `false`

* **Platform:** Codewars
* **Difficulty:** 7 kyu
* **Topics:** Fundamentals, Strings, Search

---

## 📐 Logic & Strategy

1. **Boundary Check:** If `ending` is longer than `str`, `str` cannot possibly end with `ending`, so return `false` immediately.
2. **Reverse Comparison:** Iterate backwards from the end of both strings simultaneously for the length of `ending`.
3. **Early Exit:** If any character pair doesn't match, return `false`.
4. **Success:** If the loop finishes without a mismatch, return `true`.

---

## 🛠️ Complexity Analysis

* **Time Complexity:** $\mathcal{O}(K)$ — where $K$ is the length of `ending`. The loop runs at most $K$ times.
* **Space Complexity:** $\mathcal{O}(1)$ — Operates using constant extra memory without allocating new string or array objects.

---

## 💡 Code Implementations

### ☕ Provided Manual Java Solution (Loop Approach)

```java
public class Kata {
    public static boolean solution(String str, String ending) {
        if (ending.length() > str.length()) {
            return false;
        }

        for (int i = 0; i < ending.length(); i++) {
            char strChar = str.charAt(str.length() - 1 - i);
            char endingChar = ending.charAt(ending.length() - 1 - i);

            if (strChar != endingChar) {
                return false;
            }
        }

        return true;
    }
}