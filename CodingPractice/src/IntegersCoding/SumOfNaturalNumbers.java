package IntegersCoding;

public class SumOfNaturalNumbers {

    public static int sumOfFirstNNaturalNumbers(int n){
        int sum = 0;

        if(n == 0 || n<0){
            System.out.println("Given number " + n + " is not a natural number" );
        }

        for (int i = 1; i <=n; i++){
            sum+= i;
        }

        return sum;
    }

}
