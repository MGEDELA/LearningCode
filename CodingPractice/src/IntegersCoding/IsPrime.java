package IntegersCoding;

public class IsPrime {

    public static boolean isPrime(int num){
        boolean isPrime = false;
        int count = 0;

        if(num==1 || num < 1){
           isPrime = false;
        }

        for(int i = 1; i<=num; i++) {
            if(num%i == 0){
                count++;
            }
        }

        if(count==2){
            System.out.println("Given number " + num  + " is a prime number");
            isPrime = true;
        }else{
            System.out.println("Given number " + num  + " is not a prime number");
        }

        return isPrime;
    }

}
