package D_OPERATORS;

import java.util.Scanner;

class numCompare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        double num1 = input.nextDouble();

        System.out.println("Enter your Second number");
        double num2 = input.nextDouble();

        System.out.println((num1 == num2));
        System.out.println((num1 != num2));
        System.out.println((num1 > num2));
        System.out.println((num1 < num2));
        System.out.println((num1 >= num1));
        System.out.println((num1 <= num2));


/*  In Java, relational operators automatically
    return a boolean value (`true` or `false`) as the result of comparisons,
    without the need for explicit boolean variable declarations. */

    }
}
