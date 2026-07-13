## Alternative Aproach

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
