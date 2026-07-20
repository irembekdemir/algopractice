import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int total = 0;
    
    for (int[] i : stops) {
      total += i[0]; 
      total -= i[1]; 
    }
    
    return total;
  }
}