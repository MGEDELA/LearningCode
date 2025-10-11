package IntegersCoding;

public class LCM {
    public static int leastCommonMultiple(int num1 , int num2){

        int lcm = (num1 > num2 ? num1 : num2);

            while (true){
                if(lcm % num1 ==0 && lcm % num2 ==0 ){
                    return lcm;
                }

                lcm++;
            }

    }
}
