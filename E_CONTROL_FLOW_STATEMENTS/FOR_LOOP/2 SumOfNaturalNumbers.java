package E_CONTROL_FLOW_STATEMENTS.FOR_LOOP;

import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //ask for user to input
        System.out.println("Enter a number");
        int number = input.nextInt();

        //validate input given by user
        if(number < 1){
            System.out.println("please enter a positive number");
        }

        //logic for sum of all natural numbers
        int sum = 0;
        for (int i =1; i<number; i++){
            sum = sum+i;
        }
        // printing the result
        System.out.println(sum);

    }
}
