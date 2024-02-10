package E_CONTROL_FLOW_STATEMENTS.FOR_LOOP;

import java.util.Scanner;

class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the range u want to print");
        int range = input.nextInt();

        for (int i = 2; i < range; i ++) {
            if(isPrime(i))
            System.out.println(i);
        }
    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;// 1 or less are not prime numbers
        }

        for(int i = 2; i<Math.sqrt(number); i++ ){
            if(number % i == 0){
                return false;
            }
        }
        return true;

    }
}
