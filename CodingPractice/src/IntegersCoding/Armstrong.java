package IntegersCoding;

public class Armstrong {

    public static void main(String[] args) {
        
        System.out.println(Armstrong.isArmstrong(101));
       
    }

    public static boolean isArmstrong(int num){

        
        int sum = 0;
        int org_num = num;
        if(num<=0){
            System.out.println("Given number " + num + " is not valid");
        }

        boolean Armstrong = false;

        while(num!=0){
            sum += (num%10)*(num%10)*(num%10);
            num = num/10;
        }

        System.out.println("sum is: " + sum);

        if(sum == org_num){
            Armstrong = true;
        }

        return Armstrong;
    }

}
