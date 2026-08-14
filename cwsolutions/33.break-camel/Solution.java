class Solution {
  public static String camelCase(String input) {
    StringBuilder sb = new StringBuilder();
    
    for (char c : input.toCharArray()) {
      if (Character.isUpperCase(c)){ sb.append(" ");}
      sb.append(c);
    }
  return sb.toString();
  }
  
}