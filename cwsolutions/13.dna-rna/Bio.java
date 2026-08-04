import java.util.*;

public class Bio {
    public String dnaToRna(String dna) {
      StringBuilder rna = new StringBuilder();
      for (char elem : dna.toCharArray()){
        if(elem == 84 || elem == 'T'){
          rna.append('U');
        } else {
         rna.append(elem);
        }
      }
        return rna.toString();  
    } 
}