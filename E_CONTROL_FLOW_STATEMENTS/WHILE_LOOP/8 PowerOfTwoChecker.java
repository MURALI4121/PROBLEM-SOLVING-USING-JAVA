package E_CONTROL_FLOW_STATEMENTS.WHILE_LOOP;

import java.util.Scanner;

class PowerOfTwoChecker {


    public static boolean checkIfPowerOfTwo(int num) {
        if (num <= 0) {
            return false;
        }

        boolean isPowerOfTwo = true;
        while (num > 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                isPowerOfTwo = false;
                break;
            }
        }
        return isPowerOfTwo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = scanner.nextInt();

        boolean result = checkIfPowerOfTwo(num);

        if (result) {
            System.out.println(num + " is a power of two");
        } else {
            System.out.println(num + " is not a power of two");
        }
    }
}
