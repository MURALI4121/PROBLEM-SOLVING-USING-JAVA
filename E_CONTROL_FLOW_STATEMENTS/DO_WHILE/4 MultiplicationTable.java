package E_CONTROL_FLOW_STATEMENTS.DO_WHILE;

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // initialize the number variable
        int number;

        //process at least once and continue until a neg num entered
        do{
            //prompt the user to enter a number or a negative number to exist
            System.out.println("Enter a num to get table");
            number = input.nextInt();

            if(number<0){
                System.out.println("negative number entered exiting the program ");
                break;
            }
            int i = 1;{
                do{
                    System.out.println(number + " * " + i + " = " + (number*i));
                    i++;
                }while (i<=10);
                System.out.println();

            }
        }while(true);

    }
}
