package F_METHODS_FUNCTIONS;

import java.util.Scanner;

class FactorialUsingRecursion {

    public static long factorial(long num){

        // Base case: if n is 0 or 1, return 1 (since 0! = 1! = 1)
        if(num <= 1){
            return 1;
        }
        // Recursive case : n! = (n-1)!
        else {
            return num * factorial(num-1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number to do factorial");
        long num = scanner.nextInt();
        long Factorial = factorial(num);

        System.out.println("Factorial of " + num + "is : " + Factorial);



    }
}
