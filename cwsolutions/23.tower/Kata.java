public class Kata{
  public static String[] towerBuilder(int nFloors){
    String [] tower = new String[nFloors];
    
    for (int i = 1; i <= nFloors; i++){
      String space = " ".repeat(nFloors-i);
      String star = "*".repeat(2*i-1);
    
      tower[i-1] = space + star + space;
      
      }
    
    return tower;
  }
}