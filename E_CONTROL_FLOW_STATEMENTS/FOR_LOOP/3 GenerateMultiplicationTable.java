package E_CONTROL_FLOW_STATEMENTS.FOR_LOOP;

import java.util.Scanner;

class GenerateMultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the table num you wanted : ");
        int num = input.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
