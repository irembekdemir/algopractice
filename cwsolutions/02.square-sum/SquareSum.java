public class SquareSum{

    static int total;

    public static int squareSum(int... numbers){
        for (int i=0; i< numbers.length; i++){
            total+=(numbers[i]*numbers[i]);
        }
        return total;
    }

}