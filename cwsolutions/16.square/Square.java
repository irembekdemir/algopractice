public class Square {    
    public static boolean isSquare(int n) { 
      
      if (n<0) return false;
      
      int sq = (int) Math.sqrt(n);
      
      return (n == sq*sq);
      
    }
  
}