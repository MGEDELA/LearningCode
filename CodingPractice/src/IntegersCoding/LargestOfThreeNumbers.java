package IntegersCoding;

    public class LargestOfThreeNumbers {
        
        public static int LargestOfThree(int num1, int num2, int num3){       
            int largest = num1;

            if(num1 == num2 && num2 == num3 && num3 == num1){
                    System.out.println("all the three numbers " + num1 + " and " + num2 + " and " + num3 + " are equal");
                }

                if(num2>num1 && num2>num3){
                    largest = num2;
                }
                    else if(num3>num1 && num3>num2){
                        largest = num3;

                    }

            return largest;
        }

    }
