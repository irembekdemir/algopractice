import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
      int answer = 0;
        for (int i = 0; i < binary.size(); i++){
          answer += binary.get(i)*Math.pow(2,binary.size()-i-1);
        }
      return answer;
    }
}