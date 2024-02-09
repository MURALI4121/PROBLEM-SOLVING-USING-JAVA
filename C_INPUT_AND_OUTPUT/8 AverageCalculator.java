package C_INPUT_AND_OUTPUT;


import java.util.Scanner;

class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number 1 ");
        double number1 = input.nextDouble();

        System.out.println("Please enter number 1 ");
        double number2 = input.nextDouble();

        System.out.println("Please enter number 1 ");
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3)/3;
        System.out.println("the average of three numbers is " + average);
    }
}
