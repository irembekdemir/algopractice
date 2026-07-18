# 🚀 Codewars: You're a Square!

Clean and optimized solutions in both **Python** and **Java** for the "You're a Square!" challenge on Codewars.

## 📝 Problem Description

A square of squares! You like building blocks. You especially like blocks which are squares. And what you even like more, is to square them of square blocks!

Given an integral number, determine if it's a square number. In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.

**Examples:**
* `-1`  -->  `false` (Negative numbers cannot be perfect squares)
* `0`   -->  `true`
* `3`   -->  `false`
* `4`   -->  `true`
* `25`  -->  `true`
* `26`  -->  `false`

* **Platform:** Codewars
* **Difficulty:** 7 kyu (Easy)
* **Topics:** Fundamentals, Mathematics

---

## 🛠️ Complexity Analysis

The complexity parameters remain identical across both language implementations:

* **Time Complexity:** $O(1)$ — The `Math.sqrt()` function (Java) and the `**0.5` exponentiation (Python) execute in constant time at the hardware level using floating-point operations.
* **Space Complexity:** $O(1)$ — Only a single primitive integer/float variable (`sq` / `sqr`) is allocated temporarily in memory.

## Alternative Approach (Python)

```python 
def is_square(n):
    if n < 0:
        return False
    
    sqr = int(n ** 0.5)
    return n == sqr * sqr
```

## Alternative Approach (Java)


```java
public class Square {    
    public static boolean isSquare(int n) {        
        return Math.sqrt(n) == (int)Math.sqrt(n);
    }
}

```
```java
import static java.lang.Math.*;
public class Square {    
    public static boolean isSquare(int n) {      
        return Math.sqrt(n) % 1 == 0;
    }
}

```
