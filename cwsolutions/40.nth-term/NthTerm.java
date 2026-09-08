import java.text.DecimalFormat;

public class NthSeries {
	public static String seriesSum(int n) {
    
		double result = 0;
    double bottom = 1;
    
    if (n == 0) return "0.00"; 
    
    for (int i = 0; i<=n; i++){
      if(i==1){
         result += 1.0;
        }
      else {
       bottom += 3.0;
        result += 1 / bottom;
      }
    }
    DecimalFormat df = new DecimalFormat("0.00");
    return df.format(result);
	}
}