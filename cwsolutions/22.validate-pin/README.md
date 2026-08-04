# 🚀 Codewars: Regex Validate PIN Code

A clean Java solution for the "Regex validate PIN code" challenge on Codewars.

## 📝 Problem Description

ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but **exactly** 4 digits or **exactly** 6 digits.

If the function is passed a valid PIN string, return `true`, else return `false`.

**Examples (Input --> Output):**
* `"1234"`   -->  `true`
* `"12345"`  -->  `false`
* `"a234"`   -->  `false`

* **Platform:** Codewars
* **Difficulty:** 7 kyu (Easy)
* **Topics:** Fundamentals, Strings, Validation

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — Where $n$ is the length of the string `pin`. The outer loop runs at most 6 times, and the inner loop checks a fixed array of 10 digits ($O(10 \cdot n) = O(n)$), making the execution practically instantaneous ($O(1)$ in practice due to fixed lengths).
* **Space Complexity:** $O(1)$ — Only a tiny fixed-size array (`numbers`) and a few primitive flag variables are stored in memory.

## Alternative Approach

```java
public class Solution {

  public static boolean validatePin(String pin) {

    if (pin == null || (pin.length() != 4 && pin.length() != 6)) {
      return false;
    }
    
    for (int i = 0; i < pin.length(); i++) {
      if (!Character.isDigit(pin.charAt(i))) {
        return false;
      }
    }
    return true;

  }

}
```