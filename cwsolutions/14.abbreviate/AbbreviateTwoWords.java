public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    StringBuilder sb = new StringBuilder();     //either make it static or put inside the static method
                                                //otherwise cannot use non-static var in static methods
    sb.append(Character.toUpperCase(name.charAt(0)));   
    
    for (int i = 1; i< name.length(); i++){
        if(name.charAt(i-1)==' '){
          sb.append('.');
          sb.append(Character.toUpperCase(name.charAt(i)));
        }
      }
    return sb.toString();
  }
}