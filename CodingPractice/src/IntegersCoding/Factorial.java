package IntegersCoding;

public class Factorial {

    public static int factorial(int num){
        int factorialSum = 1;

        for(int i = num; i>0; i--){
            factorialSum*= i;
        }

        return factorialSum;
    }

}
