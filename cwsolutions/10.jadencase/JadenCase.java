public class JadenCase {

	public String toJadenCase(String phrase) {

	  if (phrase == null || phrase.isEmpty() ) return null;
    
    String[] words = phrase.split(" ");
    StringBuilder answer = new StringBuilder();
    
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      
      if(!word.isEmpty()) {
        String capWord = Character.toUpperCase(word.charAt(0)) +
          word.substring(1);
        
        answer.append(capWord);
      }
      
      if(i < words.length-1) { ////
        answer.append(" ");
      }
    }
    
      return answer.toString();
	}

}