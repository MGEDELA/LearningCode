package IntegersCoding;

public class PerfectNumber {

    // Perfect Number is nothing but sum of its proper positive divisors is equal to the number itself
    // 6 divisors are 1,2,3 which the sum is equal to 6 

    public static boolean isPerfectNumber(int num){
            if(num<=0){
                return false;
            }

       
        int sum = 0;

        for(int i =1; i<num; i++){
            if(num%i == 0){
                sum+= i;
            }
        }

        return sum == num;
    }

}
