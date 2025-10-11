package IntegersCoding;

public class GCD {

    public static int greatestCommonDivisor(int num1, int num2){
        int GCD;
        while (num1!=num2) {

          if(num1>num2){
            num1 = num1 - num2;
          }
          if(num2 > num1){
            num2 = num2 - num1;
          }

        } 
        GCD = num1;
            return GCD;

        }
        
    }


