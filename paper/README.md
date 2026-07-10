# 🚀 Codewars: Beginner Series #1 School Paperwork

A clean and optimal Java solution for the "Beginner Series #1 School Paperwork" challenge on Codewars.

## 📝 Problem Description

Your classmates asked you to copy some paperwork for them. You know that there are `n` classmates and the paperwork has `m` pages.

Your task is to calculate how many blank pages do you need. If `n < 0` or `m < 0` return `0`.

* **Platform:** Codewars
* **Difficulty:** 8 kyu (Easy)
* **Topics:** Fundamentals, Conditional Statements, Multiplication

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(1)$ — The solution executes in constant time as it only involves simple conditional checks and a basic arithmetic multiplication.
* **Space Complexity:** $O(1)$ — No additional memory or data structures are allocated.

## 💡 Alternative Approach (Streamlined Java)

Instead of declaring a mutable variable and using an `if` block, we can use a single `if` statement to handle the constraints directly, making the code more concise:

```java
public class Paper {
    public static int paperWork(int n, int m) {
        if (n < 0 || m < 0) return 0;
        return n * m;
    }
}

//OR

public class Paper{
  public static int paperWork(int n, int m) {
    return (n < 0) || (m < 0) ? 0 : n * m;
  }
}