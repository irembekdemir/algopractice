class Kata {
    static String alphabetPosition(String text) {
      
      String alphabet = "abcdefghijklmnopqrstuvwxyz"; 
      
      StringBuilder sb = new StringBuilder ();
      
      for (int i = 0; i < text.length(); i++){
        for (int j = 0; j < alphabet.length(); j++){
          if (text.toLowerCase().charAt(i) == alphabet.charAt(j)){
            sb = sb.append(j+1);
            sb = sb.append(' ');
          }
        }
      }
      return sb.toString().trim();
    }
}
