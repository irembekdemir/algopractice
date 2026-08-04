public class Solution {

  public static boolean validatePin(String pin) {
    
    if (pin.length() != 4 && pin.length() != 6) {
      return false;
    }
    char [] numbers = {'0','1','2','3','4','5','6','7','8','9'};
    
    for (int i = 0; i < pin.length(); i++){
      boolean isDigit = false;
      
      for (int j = 0; j < numbers.length; j++){
        if (pin.charAt(i)==numbers[j]){
          isDigit = true;
          break;
        }
      }
      if(!isDigit) return false;
    }
    
    return true;
  }

}