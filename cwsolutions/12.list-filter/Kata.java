import java.util.*;

public class Kata  {

  public static List<Object> filterList(final List<Object> list) {
    List <Object> newList = new ArrayList <> ();

    for (Object elem : list){
      if (elem instanceof Integer){
        newList.add(elem);
      }
    }
    return newList;
  }
}
