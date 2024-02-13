package E_CONTROL_FLOW_STATEMENTS.DO_WHILE;

import java.util.Scanner;

class NumberReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to Reverse");
        int num = input.nextInt();
        int reversedNumber = 0;

        do{

            // extract the last digit of the number
             int digit = num%10;

             //shift the reversed number one position to the left and add the digit
            reversedNumber = reversedNumber*10+digit;

            //remove the last digit from original number
            num /= 10;

        }while(num !=0);
        System.out.println(" After Reversing: " + reversedNumber);
    }
}
