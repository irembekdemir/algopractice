# 🚀 Codewars: Basic Mathematical Operations

A clean Java solution for the "Basic Mathematical Operations" challenge on Codewars.

## 📝 Problem Description

Your task is to create a function that does four basic mathematical operations.
The function should take three arguments - `operation(string/char)`, `value1(number)`, `value2(number)`.
The function should return result of numbers after applying the chosen operation.

**Examples (Operator, value1, value2 --> Output):**
* `("+", 4, 7) --> 11`
* `("-", 15, 18) --> -3`
* `("*", 5, 5) --> 25`
* `("/", 49, 7) --> 7`

* **Platform:** Codewars
* **Difficulty:** 8 kyu (Easy)
* **Topics:** Fundamentals, Mathematics, Conditional Statements

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(1)$ — The solution checks a fixed number of conditional blocks, taking constant time.
* **Space Complexity:** $O(1)$ — Only a single primitive integer variable is used for the calculation, requiring constant memory.

## 💡 Alternative Approach (Modern Java Switch Expression)

In modern Java (Java 12+), we can use `switch` expressions to write this much more compactly. This approach also avoids using `==` for `String` comparisons, which is a best practice in Java to prevent reference-matching bugs:

```java
public class BasicMath {
    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> throw new IllegalArgumentException("Unknown operator: " + op);
        };
    }
}
```

## 💡 Alternative Approach (Python)

```python
import operator

def basic_op(op, v1, v2):
    ops = {"+": operator.add, "-": operator.sub, "*": operator.mul, "/": operator.truediv}
    return ops[op](v1, v2)
```