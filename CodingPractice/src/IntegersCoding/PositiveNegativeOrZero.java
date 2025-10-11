package IntegersCoding;

public class PositiveNegativeOrZero {

    public static String positiveNegativeOrZero(int num){
        String state = "Positive";

            if(num>0){
        System.out.println("Given number " + num + " is Positive ");
            }
            else if (num<0) {
                System.out.println("Given number " + num + " is Positive");
                
            } else {
              System.out.println("Given number " + num + " is Zero");  
            }

        return state;
    }

}
