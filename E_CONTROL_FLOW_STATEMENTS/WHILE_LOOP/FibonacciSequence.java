package E_CONTROL_FLOW_STATEMENTS.WHILE_LOOP;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;
        int counter = 2;
        while(counter < num  ){
            int temp = num1 + num2;
            System.out.println(temp + " ");
            num1 = num2;
            num2 = temp;
            counter ++;

        }

    }
}
