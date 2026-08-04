# 🚀 Codewars: DNA to RNA Conversion

A clean Java solution for the "DNA to RNA Conversion" challenge on Codewars.

## 📝 Problem Description

Deoxyribonucleic acid (DNA) is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases: Guanine (`G`), Cytosine (`C`), Adenine (`A`), and Thymine (`T`).

Ribonucleic acid (RNA) is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil (`U`).

Your task is to create a function which translates a given DNA string into RNA.

**Example:**
* `"GCAT"` --> `"GCAU"`

*Note: The input string can be of arbitrary length - in particular, it could be empty. All inputs are guaranteed to be valid, i.e. the input string will only ever consist of `A`, `C`, `G` and/or `T`.*

* **Platform:** Codewars
* **Difficulty:** 8 kyu (Easy)
* **Topics:** Fundamentals, Strings, Biology

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — Where $n$ is the length of the DNA string. The method converts the string to a character array and iterates through it exactly once to replace `'T'` with `'U'`.
* **Space Complexity:** $O(n)$ — `s.toCharArray()` creates a temporary character array of size $n$, and the `StringBuilder` dynamically allocates space to construct the resulting RNA string of the same size.

## Alternative Approach
```java

public class Bio{
    public String dnaToRna(String dna){
        return dna.replace("T", "U");
    } 
}
```
```java
import java.io.*;

public class Bio {
    public String dnaToRna(String dna){
        return dna.replaceAll("T", "U");
    } 
}

```

```java
public class Bio{
    public String dnaToRna(String dna){
    char[] arr = dna.toCharArray();
    String rna = "";
    for(int i=0;i<arr.length;i++){   
      if((arr[i])=='T'){
        arr[i]='U';
      }
    }
    rna = String.valueOf(arr);
    return rna;
    } 
}
```
