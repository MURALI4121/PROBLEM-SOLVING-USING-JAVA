package F_METHODS_FUNCTIONS;

import java.util.Scanner;

class isPrime {

    public static boolean isPrime(int num) {

        // handle edge cases : 1 and negative numbers are not prime
        if (num < 1) {
            return false;
        }

        int limit = (int) Math.sqrt(num);

        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = scanner.nextInt();

        System.out.println("the give number is " + isPrime(num));

    }
}
