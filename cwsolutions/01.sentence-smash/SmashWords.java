public class SmashWords {

	public static String smash(String... words) {
    
    if(words.length>0){
      String result= words[0];
      
      for (int i=1; i<words.length; i++){
        result=result+" "+words[i];
      }
      
      return result;

    }else{
        return "";
    }

  }
  
}
