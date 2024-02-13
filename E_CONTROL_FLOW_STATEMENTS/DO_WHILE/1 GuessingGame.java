package E_CONTROL_FLOW_STATEMENTS.DO_WHILE;

import java.util.Random;
import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // generate a number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        // Setup Scanner for input
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        do {
            System.out.println("Guess a number between 1 and 100");

            //Read the user guess
            guess = scanner.nextInt();

            //Check the guess and provide feedback
            if (guess < numberToGuess) {
                System.out.println("Too low,Try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("congo! you have guessed the right number");
            }
        } while (guess != numberToGuess);//Continue until the user guesses correctly
    }
}
