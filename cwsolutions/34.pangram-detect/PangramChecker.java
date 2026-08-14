public class PangramChecker {
  public boolean check(String sentence){
    String word = sentence.toLowerCase();
    
    for (char c= 'a'; c<'z'; c++){
      if(!word.contains(String.valueOf(c))) return false;
    }
    return true;
  }
}