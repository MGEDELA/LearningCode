package IntegersCoding;

public class PrimeNumbers {


    public static void printPrimeNumersUpTON(int num){

        for(int i = 1; i<=num; i++){
            printPrimeIfYes(i);
        }

    }

    public static void  countPrimeNumbersUpToN(int num1, int num2){
        int primeCount = 0;

        for(int i = num1; i <= num2; i++){
            printPrimeIfYes(i);    
        }
        System.out.println("Prime number count netween" +num1 + " and" + num2 + " is: " +primeCount);
    }

    
    

   public static void printPrimeIfYes(int num){
        int count = 0;

    for(int i = 1; i<=num; i++){
        if((num%i == 0)){
            count++;
        }
    }

    if(count == 2){
        System.out.println(num );
    // }else{
    //     System.out.println(  num +  " is not a prime number");
     }

     System.out.println( " Prime Number Count is" + count);
   }

}
