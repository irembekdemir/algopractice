public class Sum {
  public int GetSum(int a, int b){
    
    if(a==b) return a;
    
    int answer = 0;
    
    int left = Math.min(a,b);
    int right = Math.max(a,b);
    
    for (int i = left; i <= right; i++) {
       answer += i;
      }
      
      return answer;
  }
}
