# 🚀 Codewars: Disemvowel Trolls

A clean Java solution for the "Disemvowel Trolls" challenge on Codewars.

## 📝 Problem Description

Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

*Note: For this kata `y` isn't considered a vowel.*

* **Platform:** Codewars
* **Difficulty:** 7 kyu (Easy)
* **Topics:** Fundamentals, Strings, Regular Expressions

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — Where $n$ is the length of the string. The loop iterates through each character exactly once, and `vowels.indexOf()` takes constant time $O(1)$ since the list of vowels has a fixed size of 10.
* **Space Complexity:** $O(n)$ — A `StringBuilder` is used to construct the output string, which in the worst-case scenario (no vowels) will store all $n$ characters.

## 💡 Alternative Approach 

```java
public class Troll {
    public static String disemvowel(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }
}
```

```java

public class Troll {
  public static String disemvowel(String str) {
      return str.replaceAll("[aAeEiIoOuU]", "");
  } 
}
```

```java
public class Troll {
    public static String disemvowel(String str) {

        String answer = "";
        
        for(int i = 0; i < str.length(); i++) {

          if(str.charAt(i) != 'a' 
              && str.charAt(i) != 'e' 
              && str.charAt(i) != 'i' 
              && str.charAt(i) != 'o' 
              && str.charAt(i) != 'u'
              && str.charAt(i) != 'A' 
              && str.charAt(i) != 'E' 
              && str.charAt(i) != 'I' 
              && str.charAt(i) != 'O' 
              && str.charAt(i) != 'U') {
              
            answer = answer + str.charAt(i);
          }
        }
        return answer;
    }
}
```
