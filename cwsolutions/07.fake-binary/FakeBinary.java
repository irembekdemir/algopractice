public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder(numberString);
      
      for (int i = 0; i<sb.length(); i++){
        
        if((int)sb.charAt(i) >= '5'){
          sb.setCharAt(i, '1');
        }else{
          sb.setCharAt(i, '0');
        }
      }
    String newStr = sb.toString();
      return newStr;
    }
}