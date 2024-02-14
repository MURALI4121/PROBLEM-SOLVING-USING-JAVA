package E_CONTROL_FLOW_STATEMENTS.SWITCH_CONTINUE_BREAK;

import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter the first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();

            System.out.println("Choose an operation (+, -, *,/) or type exit to quit");
            String operation = scanner.next();

            switch (operation){
                case "+":
                    System.out.printf("Result: %.2f/n", (number1 + number2));
                    break;
                case "-":
                    System.out.printf("Result: %.2f/n", (number1-number2));
                    break;
                case "*":
                    System.out.printf("Result: %.2f\n", (number1 * number2));
                    break;
                case "/":
                    if (number2 != 0) {
                        System.out.printf("Result: %.2f\n", (number1 / number2));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case "exit":
                    System.out.println("Exiting program");
                    return;
                default:
                    System.out.println("Invalid operation. please try again");
            }

            System.out.println("Do you want to perform another operation (yes/no)");
            String answer = scanner.next();
            if(!answer.equalsIgnoreCase("yes")){
                System.out.println("Exiting the program ");
                break;
            }

        }
    }
}
