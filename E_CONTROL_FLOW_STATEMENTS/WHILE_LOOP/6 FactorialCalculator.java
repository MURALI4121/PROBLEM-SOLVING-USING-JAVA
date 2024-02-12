package E_CONTROL_FLOW_STATEMENTS.WHILE_LOOP;

import java.util.Scanner;

class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the fact number");

        int fact = scanner.nextInt();

        int num = 1;
        int i = 1;
        while (i<fact){
            num = num * i;
            i++;
        }
        System.out.println(num);


    }
}
