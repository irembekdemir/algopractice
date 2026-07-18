# 🚀 Codewars: Find the Next Perfect Square

Clean and optimized solutions in both **Java** and **Python** for the "Find the Next Perfect Square" challenge on Codewars.

## 📝 Problem Description

You might know some perfect squares. But what about the next one?

Complete the function that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer $n$ such that $\sqrt{n}$ is also an integer.

If the argument is itself not a perfect square then return `-1` or `-1.0` depending on the language. You may assume the argument is non-negative.

**Examples (Input --> Output):**
* `121` --> `144` (Since 121 is $11^2$, the next is $12^2$)
* `625` --> `676` (Since 625 is $25^2$, the next is $26^2$)
* `114` --> `-1`   (Since 114 is not a perfect square)

* **Platform:** Codewars
* **Difficulty:** 7 kyu (Easy)
* **Topics:** Fundamentals, Mathematics

---
## Alternative Approach

```java
public class NumberFun {
  public static long findNextSquare(long sq) {
      long result; 
      double d = Math.sqrt(sq);

      if ( d % 1  == 0) {
       result = (long) Math.pow(++d, 2);
      } else result = -1;
      
      return result;
  }
}
```