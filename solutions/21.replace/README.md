# 🚀 Codewars: Replace With Alphabet Position

A clean Java solution for the "Replace With Alphabet Position" challenge on Codewars.

## 📝 Problem Description

In this kata you are required to, given a string, replace every letter with its position in the alphabet.

If anything in the text isn't a letter, ignore it and don't return it.

`"a" = 1`, `"b" = 2`, etc.

**Example:**
* Input: `"The sunset sets at twelve o' clock."`
* Output: `"20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"`

* **Platform:** Codewars
* **Difficulty:** 6 kyu (Medium)
* **Topics:** Fundamentals, Strings, Characters

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — Where $n$ is the length of the string `text`. Although there is a nested loop, the inner loop runs over a constant alphabet size of 26 iterations ($O(26 \cdot n) = O(n)$).
* **Space Complexity:** $O(n)$ — A `StringBuilder` is used to dynamically construct the output string, requiring linear space relative to the number of valid alphabetical characters in the input.

## Alternative Approach

```java
class Kata {
    static String alphabetPosition(String text) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : text.toLowerCase().toCharArray()) {
            // Only the characters between 'a' and 'z' (eliminates the rest numbers etc.)
            if (c >= 'a' && c <= 'z') {
                int position = c - 'a' + 1;
                sb.append(position).append(" ");
            }
        }
        
        return sb.toString().trim();
    }
}
```