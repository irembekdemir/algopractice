public class Kata {
    public static boolean solution(String str, String ending) {
      
        if (ending.length() > str.length()) {
            return false;
        }
      
        for (int i = 0; i < ending.length(); i++){
          char strChar = str.charAt(str.length()-1-i);
          char endingChar = ending.charAt(ending.length() - 1 - i);
          
          if (strChar != endingChar) return false;
          
        }
      
        

        return true;
    }
}