# Codewars: Are You Playing Banjo?

A clean and optimal Java solution for the "Are You Playing Banjo?" challenge on Codewars.

## Problem Description

Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter **"R"** or lower case **"r"**, you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:
* `name + " plays banjo"`
* `name + " does not play banjo"`

Names given are always valid strings.

### Examples:
* `areYouPlayingBanjo("Rikke")` ➔ `"Rikke plays banjo"`
* `areYouPlayingBanjo("robert")` ➔ `"robert plays banjo"`
* `areYouPlayingBanjo("Martin")` ➔ `"Martin does not play banjo"`
* `areYouPlayingBanjo("bravo")` ➔ `"bravo does not play banjo"`

* **Platform:** Codewars
* **Difficulty:** 8 kyu
* **Topics:** Fundamentals, Strings, Conditional Statements

---

## 📐 Logic & Algorithm

1. **First Character Inspection:** Extract the first character of the string using `name.charAt(0)`.
2. **Case-Insensitive Check:** Check if this character is equal to `'R'` or `'r'`.
3. **Format Output:** Return the corresponding result string based on the boolean check.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(1)$ — Inspecting the first character at index `0` and string concatenation run in constant time.
* **Space Complexity:** $\mathcal{O}(1)$ — Operates without allocating additional data structures or dynamic memory.

---

## Alternative Approaches

### Ternary Operator

```java
public class Banjo {

    public static String areYouPlayingBanjo(String name) {
        return (name.charAt(0) == 'R' || name.charAt(0) == 'r') 
            ? name + " plays banjo" 
            : name + " does not play banjo";
    }
}
```

### .startsWith() & .toLowerCase()

```java
public class Banjo {

    public static String areYouPlayingBanjo(String name) {
        if (name.toLowerCase().startsWith("r")) {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
}
```