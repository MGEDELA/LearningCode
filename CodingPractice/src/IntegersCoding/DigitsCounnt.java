package IntegersCoding;

public class DigitsCounnt {

    public static int digitsCountInaNumber(int num){
        int count = 0;

        while (num!=0) {
            count++;
            num = num/10;   
        }
        return count;
    }

}
