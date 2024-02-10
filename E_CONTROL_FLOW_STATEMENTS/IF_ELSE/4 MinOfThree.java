package E_CONTROL_FLOW_STATEMENTS.IF_ELSE;

import java.util.Scanner;

class MinOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number :");
        double num1 = input.nextDouble();

        System.out.println("Enter Second Number :");
        double num2 = input.nextDouble();

        System.out.println("Enter Third Number :");
        double num3 = input.nextDouble();

        if(num1 > num2 && num1 > num3){
            System.out.println("First number is greatest");
        } else if (num2>num3) {
            System.out.println("second number is greatest");
        }else{
            System.out.println("third number is greatest");
        }
    }
}
