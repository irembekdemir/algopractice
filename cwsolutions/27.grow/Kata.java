public class Kata{

  public static int grow(int[] x){

    int answer = 1;
    for (int elem: x) answer*=elem;
    
    return answer;
  
  }

}
