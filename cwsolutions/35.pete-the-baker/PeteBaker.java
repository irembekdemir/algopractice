import java.util.Map;

public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
    
    int count = Integer.MAX_VALUE; //default biggest number to prevent Math.min error later

    for ( Map.Entry<String, Integer> elem : recipe.entrySet()) {

      String thing = elem.getKey();
      int amount = elem.getValue();
      
      if (!available.containsKey(thing)) return 0;

      int current = available.get(thing)/amount;
      
      count = Math.min(count, current);
      
    }
    
    return count;
  }
}