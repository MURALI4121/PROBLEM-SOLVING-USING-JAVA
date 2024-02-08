package C_INPUT_AND_OUTPUT;

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = input.nextInt();

        //checking the given number is even or odd
        if(number % 2 == 0){
            System.out.println("The given number is even");
        }else {
            System.out.println("the given number is odd");
        }

    }
}
