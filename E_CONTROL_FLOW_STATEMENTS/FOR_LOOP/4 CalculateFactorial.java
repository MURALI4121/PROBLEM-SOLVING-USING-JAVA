package E_CONTROL_FLOW_STATEMENTS.FOR_LOOP;

import java.util.Scanner;

class CalculateFactorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number you want to done factorial");
        int fact = input.nextInt();

        if(fact < 0){
            System.out.println("fact for neg num not defined");
            return;//exit if the input is negative as factorial is not defined fo negetive numbers
        }

        // // Factorial of 0 and 1 are both 1, so directly handle these cases.
        if (fact == 0 || fact == 1 ) {
            System.out.println("1");
        }else{

            int val = 1;
            for (int i = 1 ; i <= fact; i++) {
                val = val*i;
            }
            System.out.println(val);

        }



    }
}
