package E_CONTROL_FLOW_STATEMENTS.IF_ELSE;

import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First number");
        double num1 = input.nextDouble();

        System.out.println("enter the second Number");
        double num2 = input.nextDouble();

        System.out.println("enter the operation");
        String operator = input.next();

        if ("+".equals(operator)){
            System.out.println("The addition of two nums is " + (num1+num2));
        }else if("-".equals(operator)){
            System.out.println("the subraction of two nums is"+ (num1-num2));
        }else if("*".equals(operator)){
            System.out.println("the multiplication of two nums is"+(num1*num2));
        }else if("/".equals(operator)){
            System.out.println("the division of two nums is " + (num1/num2));
        }else{
            System.out.println("enter a valid operator");
        }
    }
}
