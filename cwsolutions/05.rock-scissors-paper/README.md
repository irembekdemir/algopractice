# 🚀 Codewars: Rock Paper Scissors!

A clean Java solution for the classic "Rock Paper Scissors!" challenge on Codewars.

## 📝 Problem Description

Let's play! You have to return which player won! In case of a draw return `Draw!`.

**Examples (Input1, Input2 --> Output):**
* `"scissors", "paper" --> "Player 1 won!"`
* `"scissors", "rock" --> "--> "Player 2 won!"`
* `"paper", "paper" --> "Draw!"`

* **Platform:** Codewars
* **Difficulty:** 8 kyu (Easy)
* **Topics:** Fundamentals, Conditional Statements, Strings

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(1)$ — The solution checks a fixed set of conditional statements, executing in constant time regardless of the inputs.
* **Space Complexity:** $O(1)$ — Only a few reference strings are stored, resulting in constant memory usage.

## 💡 Alternative Approach (Optimized Java using `.equals()`)

In Java, it is best practice to compare `String` values using the `.equals()` method rather than the `==` operator to ensure content-based comparison. We can also return the result immediately to avoid checking unnecessary `if` blocks once a match is found:

```java
public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";
        
        boolean p1Won = (p1.equals("scissors") && p2.equals("paper")) ||
                        (p1.equals("paper") && p2.equals("rock")) ||
                        (p1.equals("rock") && p2.equals("scissors"));
        
        return p1Won ? "Player 1 won!" : "Player 2 won!";
    }
}
```