package E_CONTROL_FLOW_STATEMENTS.FOR_LOOP;

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number");
        int number = input.nextInt();

        if(number < 0 ){
            System.out.println("please enter the positive number");
        }

        int fib1 = 0;
        int fib2 = 1;
        for(int i = 1; i<=number; ++i){
            System.out.print(fib1 + " ");
            int nextterm = fib1 + fib2;
            fib1=fib2;
            fib2 = nextterm;
        }



    }
}
