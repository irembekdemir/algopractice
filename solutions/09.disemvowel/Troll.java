public class Troll {
    public static String disemvowel(String str) {
      
      StringBuilder answer = new StringBuilder();
      String vowels = "aeiouAEIOU";
      
      for (int i=0; i<str.length(); i++){
        char currentChar = str.charAt(i);
          
        if (vowels.indexOf(currentChar) == -1) //index -> char -> index 
          answer.append(currentChar);        // if does not contain returns -1

      }
      
      return answer.toString();
   }
}