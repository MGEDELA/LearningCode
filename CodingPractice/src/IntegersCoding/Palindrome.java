package IntegersCoding;

public class Palindrome {

    public static boolean isPalindrome(int num){
       
        int org_Num = num;
        int rev_Num = NumberReversal.reversal(org_Num);
         
        boolean palindrome = false;
        if(org_Num == rev_Num){
            palindrome = true;
        }

        return palindrome;
        }

}
