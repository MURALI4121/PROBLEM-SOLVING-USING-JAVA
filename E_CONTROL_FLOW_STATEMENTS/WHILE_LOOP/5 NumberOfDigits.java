package E_CONTROL_FLOW_STATEMENTS.WHILE_LOOP;

import java.util.Scanner;

class NumberOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a number");
        long number = scanner.nextLong();

        int count = 0;
        while(number>0){
            number = number/10;
            count++;
        }
        System.out.println("te number of digits you entered is " + count);
    }
}
