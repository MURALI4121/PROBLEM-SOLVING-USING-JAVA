package E_CONTROL_FLOW_STATEMENTS.WHILE_LOOP;

import java.util.Scanner;

class UserControlledLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0; //initialize sum

        while (true){ // use a loop continuously read numbers
            System.out.println("Enter the Numbers");
            double number = input.nextDouble();

            if(number == 0){ // check if user entered 0
                break;// if its 0 exit the loop
            }

            sum += number; // add the entered number to sum
        }
        System.out.println("the sum of all entered numbers: " + sum);

        }
    }

