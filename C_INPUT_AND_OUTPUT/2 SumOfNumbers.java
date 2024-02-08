package C_INPUT_AND_OUTPUT;

import java.util.Scanner;

class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number :");
        int num1 = input.nextInt();

        System.out.println("Enter your second number :");
        int num2 = input.nextInt();

        int sum = num1+num2;

        System.out.println("the sum of given two numbers is : " + sum);


    }
}
