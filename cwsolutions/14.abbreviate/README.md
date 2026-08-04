# 🚀 Codewars: Abbreviate a Two Word Name

A clean Java solution for the "Abbreviate a Two Word Name" challenge on Codewars.

## 📝 Problem Description

Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be capital letters with a dot separating them.

**Examples:**
* `"Sam Harris"` --> `"S.H"`
* `"patrick feeney"` --> `"P.F"`

* **Platform:** Codewars
* **Difficulty:** 8 kyu (Easy)
* **Topics:** Fundamentals, Strings, Regular Expressions

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — Where $n$ is the length of the string `name`. The loop iterates through the string characters exactly once to find the space and the initials.
* **Space Complexity:** $O(n)$ — A `StringBuilder` is used to accumulate the initials and the dot delimiter, requiring linear space relative to the size of the output (which is constant in practice, but $O(n)$ structurally for the input scanning).

## Alternative Approach
```java
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] names = name.split(" ");
    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
  }
}
```

```java

public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    name = name.toUpperCase(); 
    return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
  }
}
```

```java
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String x = name.charAt(0) + ".";
  
    for (int i = 0; i < name.length(); i++) {
      if (name.charAt(i) == ' ') {
        i++;
        x += name.charAt(i);
      }
    }
    return x.toUpperCase();
  }
}
```