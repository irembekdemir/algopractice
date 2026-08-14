# Codewars: Break camelCase

A clean and optimal Java solution for the "Break camelCase" challenge on Codewars, featuring both Regular Expressions (Regex) and imperative `StringBuilder` approaches.

## Problem Description

Complete the solution so that the function will break up camel casing, using a space between words.

### Examples:
* `"camelCasing"` ➔ `"camel Casing"`
* `"identifier"` ➔ `"identifier"`
* `""` ➔ `""`
* `"camelCasingTest"` ➔ `"camel Casing Test"`

* **Platform:** Codewars
* **Difficulty:** 6 kyu
* **Topics:** Fundamentals, Strings, Regular Expressions

---

## Logic & Strategy

The task requires detecting every uppercase letter (`A-Z`) in a given camelCase string and prepending a space (` `) right before it.

There are two primary approaches in Java to accomplish this:

1. **Regular Expressions (`replaceAll`):** Look for any capital letter matching the range `[A-Z]` and replace it with a space followed by the matched letter itself (`$1`).
2. **Character Iteration (`StringBuilder`):** Loop through each character of the string, check if `Character.isUpperCase(c)` is true, append a space if it is, and then append the character itself.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(n)$ — Where $n$ is the length of the string. Both approaches perform a single linear traversal of the input characters.
* **Space Complexity:** $\mathcal{O}(n)$ — A new string of length $n + k$ (where $k$ is the number of spaces added) is allocated for the output.

---

## Alternative Approaches

### Solution 1: Regex Approach (Concise & One-Liner)

Using `String.replaceAll()` with back-referencing:

```java
public class Solution {

    public static String camelCase(String input) {
        // Find every uppercase letter ([A-Z]) and replace it with " " + the letter ($1)
        return input.replaceAll("([A-Z])", " $1");
    }
}
```

### Solution 2: Java Streams / Lookahead Regex Alternative

Using positive lookahead regex matching:

```java
public class Solution {

    public static String camelCase(String input) {
        // Fits a space before any uppercase character using positive lookahead (?=[A-Z])
        return input.replaceAll("(?=[A-Z])", " ");
    }
}
```

### Solution 3:

More primitive approach of mine: 

```java
class Solution {
  public static String camelCase(String input) {
    String output = "";
        for (int i = 0; i < input.length(); i++) 
            output = Character.isUpperCase(input.charAt(i)) ? output + " " + input.charAt(i) : output + input.charAt(i);
        
        return output;
  }
}
```