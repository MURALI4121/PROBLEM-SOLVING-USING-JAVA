package E_CONTROL_FLOW_STATEMENTS.DO_WHILE;

import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("enter a non negative integer to calculate its factorial");
            int number = input.nextInt();

            //Check if the number is negative to terminate the loop
            if(number < 0){
                System.out.println("negative number entered. exiting the program");
                break;
            }

            // calculate factorial for non- negative numbers
            long factorial = 1; // initialize factorial result variable
            for(int i=1; i<=number; i++){
                factorial *= i; //calculate factorial
            }
            System.out.println("the factorial of given number is " + factorial);
        }while(true);
    }
}
