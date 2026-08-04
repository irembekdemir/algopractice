# 🚀 Codewars: Fake Binary

A clean and optimal Java solution for the "Fake Binary" challenge on Codewars.

## 📝 Problem Description

Given a string of digits, you should replace any digit below 5 with `'0'` and any digit 5 and above with `'1'`. Return the resulting string.

* **Note:** The input string will never be empty.

* **Platform:** Codewars
* **Difficulty:** 8 kyu (Easy)
* **Topics:** Strings, Character Manipulation, Loops

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(N)$ — Where $N$ is the length of the input string. We iterate through the string exactly once using a loop to process each character.
* **Space Complexity:** $O(N)$ — We use a `StringBuilder` to modify the characters, which allocates memory proportional to the size of the input string.

## 💡 Alternative Approach (Streamlined Java)

Instead of using `sb.setCharAt()` inside an `if-else` block, we can convert the input string into a character array (`char[]`) or use a `StringBuilder` by appending characters sequentially. Comparing character literals directly (`char < '5'`) avoids ASCII bugs:

```java
public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();
        for (char c : numberString.toCharArray()) {
            result.append(c < '5' ? '0' : '1');
        }
        return result.toString();
    }
}
```

## 💡 Alternative Approach (Python)

```python
def fake_bin(x):
    return "".join(['0' if char < '5' else '1' for char in x])
```