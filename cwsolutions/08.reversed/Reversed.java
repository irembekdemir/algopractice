public class Reversed {

  public static String solution(String str) {
    if (str == null) return null;
    StringBuilder sb = new StringBuilder(str);
      
    for (int i=0; i<sb.length()/2; i++){
      int leftIndx = i;
      int rightIndx = sb.length()-1-i;
        
      char left = sb.charAt(leftIndx);
      char right = sb.charAt(rightIndx);
      
      sb.setCharAt(leftIndx, right);
      sb.setCharAt(rightIndx, left);
      
    }
    
    return sb.toString();
  }

}