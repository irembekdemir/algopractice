##Alternative Approach
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
