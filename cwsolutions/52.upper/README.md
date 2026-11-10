# 🚀 Codewars: Is the String Uppercase?

A clean and optimal Python solution for checking if all characters in a string are uppercase on Codewars.

---

## 📝 Problem Description

Create a method to see whether the string is ALL CAPS.

For example:
- `c.is_uppercase() == False`
- `C.is_uppercase() == True`
- `hello I AM DONALD` == `False`
- `HELLO I AM DONALD` == `True`
- `ACSKLDFJSgSKLDFJSKLDFJ` == `False`
- `ACSKLDFJSGSKLDFJSKLDFJ` == `True`

In this Kata, a string is considered to be in ALL CAPS if it does not contain any lowercase letters. Any lowercase letters present in the string mean it is not all uppercase. (Note: Strings that contain no letters at all should also be considered uppercase).

- **Platform:** Codewars
- **Difficulty:** 8 kyu (Easy)
- **Topics:** Strings, Fundamentals, Logic

---

## 🛠️ Complexity Analysis

- **Time Complexity:** $O(N)$ — Where $N$ is the length of the string. In the worst case, we inspect each character once.
- **Space Complexity:** $O(1)$ — We use a constant amount of extra memory regardless of the input size.

---

## 💡 Alternative Approach (Pythonic Built-in Method)
In production Python code, we can achieve this check instantly and cleanly using the built-in .isupper() string method:


```python
def is_uppercase(inp):
    return inp.isupper()
    `````

OR

```python
def is_uppercase(inp):
    uppercase_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    
    for el in inp:

        if el.isalpha() and el not in uppercase_letters:
            return False
            
    return True
    ```