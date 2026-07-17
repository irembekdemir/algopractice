public class Printer {
    
    public static String printerError(String s) {
  
        int faultCount = 0;
      int overall= s.length();
      String print_error = "";
      
        for (char elem : s.toCharArray()) {
          if (elem > 'm'){
            faultCount ++;
          }
        }
      
      print_error = String.format("%d/%d", faultCount, overall);
      return print_error;
    }
}