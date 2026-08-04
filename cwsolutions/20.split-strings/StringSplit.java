import java.util.*;

public class StringSplit {
    public static String[] solution(String s) {
      
      if (s.length() % 2 != 0) {
        s = s + "_";
      }
      
      List <String> list = new ArrayList<>();
      
      for (int i = 0; i < s.length(); i+=2){
        String done = s.substring(i, Math.min(s.length(), i+2));
        list.add(done);
      }
      
      return list.toArray(new String[0]);
    }
  
}