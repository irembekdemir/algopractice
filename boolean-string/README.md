# 🚀 Codewars: Convert a Boolean to a String

A clean and optimal Java solution for the "Convert a Boolean to a String" challenge on Codewars.

## 📝 Problem Description

The goal is to implement a function which convert the given boolean value into its string representation. 
* If the input is `true`, it should return the string `"true"`.
* If the input is `false`, it should return the string `"false"`.

* **Platform:** Codewars
* **Difficulty:** 8 kyu (Easy)
* **Topics:** Booleans, Strings, Fundamentals

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(1)$ — The conversion happens in constant time because the input size is fixed (a single boolean value).
* **Space Complexity:** $O(1)$ — No additional structural memory is allocated; we only return a constant string reference.

## 💡 Alternative Approach (Java 8+)

For a highly readable and standard production-ready approach, `String.valueOf()` is the most common way to convert primitive types to their string representation in Java:

```java
public class BooleanToString {
  public static String convert(boolean b){
    return b ? "true" : "false";
  }
}

//OR

public class BooleanToString {
  
  public static String convert(boolean b){

    return String.valueOf(b);

  }

}
```
## 💡 Alternative Approach (Python)

Mapping by dictionary: 

```python
def bool_to_str(b):
  map = {True: "True", False: "False"}
  return map[b]
```

List index: (Since bool type is a subset of int)

```python
def bool_to_str(b):
  return ["False" , "True"][b]
```
