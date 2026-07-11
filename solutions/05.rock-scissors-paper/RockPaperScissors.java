public class RockPaperScissors {
  public static String rps(String p1, String p2) {
    String sc = "scissors", p = "paper", r = "rock", p1won = "Player 1 won!", 
    p2won = "Player 2 won!", draw = "Draw!", answer = "";
  
  
    if (p1 == sc){
      if (p2 == p) {answer = p1won;}
      if (p2 == r) {answer = p2won;}
      if (p2 == sc) {answer = draw;}
    }
    
    if (p1 == p){
      if (p2 == r) {answer = p1won;}
      if (p2 == sc) {answer = p2won;}
      if (p2 == p) {answer = draw;}
    }
    
    if (p1 == r){
      if (p2 == sc) {answer = p1won;}
      if (p2 == p) {answer = p2won;}
      if (p2 == r) {answer = draw;}
    }
    
    return answer;
    
  }
}