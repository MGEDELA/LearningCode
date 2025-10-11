package IntegersCoding;

public class NumberReversal {

    public static int reversal(int num){

        int revNum = 0;
        while(num!=0){
            int rem = num%10;
            revNum = (revNum*10)+rem;
            num = num/10;
        }

        return revNum;
    }

}
