public class BasicMath{
  
  public static Integer basicMath(String op, int v1, int v2){
    int answer = 0;
    if (op == "+"){
      answer = v1 + v2;
    }
    if (op == "-"){
      answer = v1 - v2;
    }
    if (op == "*"){
      answer = v1 * v2;
    }
    if (op == "/"){
      answer = v1 / v2;
    }
    return answer;
  }
}