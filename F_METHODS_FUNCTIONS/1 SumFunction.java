package F_METHODS_FUNCTIONS;

import java.util.Scanner;

class SumFunction {

    public static  double Sum(Double num1,double num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number ");
        double num1 = scanner.nextDouble();

        System.out.println("enter your second number");
        double num2 = scanner.nextDouble();

        System.out.println("the sum of given number is " +  Sum(num1,num2) );
    }
}
