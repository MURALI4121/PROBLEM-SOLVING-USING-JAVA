package E_CONTROL_FLOW_STATEMENTS.SWITCH_CONTINUE_BREAK;

import java.util.Scanner;

class NumberClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number or (-1 to exit): ");
            int number = scanner.nextInt();

            if (number == -1){
                System.out.println("Exiting the program");
                break;
            }

            //Convert the user input into a category for the switch statement
            int category = (number > 0) ? 1 : (number < 0) ? -1:0;

            switch(category){
                case 1: //Positive
                    System.out.println("Positive");
                    break;
                case -1: //Negative
                    System.out.println("Negative");
                    break;
                case 0: //Zero
                    System.out.println("Zero");
                    break;
                default:
                    //this case should never be reached due to way category is calculated
                    System.out.println("Unknown category");
                    break;
            }
        }
    }
}
