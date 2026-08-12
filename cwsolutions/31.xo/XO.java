public class XO {
  
  public static boolean getXO (String str) {
    int xCount = 0;
    int oCount = 0;
    
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == 'x' || str.charAt(i) == 'X' ) xCount++;
      if (str.charAt(i) == 'o' || str.charAt(i) == 'O') oCount++;
    }
    
    if (oCount == xCount) return true;
    else return false;
    
  }
}