package IntegersCoding;

public class LargestOfTwoNumbers {

    public static int largestOftwo(int num1, int num2){
        int largest = num1;

        if(num1 == num2){
            System.out.println("Both numbers " + num1 + " and " + num2 + " are equal");
        }

        if(num1<num2){
            largest = num2;
        }

        return largest;
    }

}
