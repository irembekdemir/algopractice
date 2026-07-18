public class NumberFun {
  public static long findNextSquare(long sq) {
    
    long sqrt = (long) Math.sqrt(sq);
    
      if (sqrt*sqrt == sq) {return (long) Math.pow(sqrt+1 , 2);}
      return -1; 
  }
}