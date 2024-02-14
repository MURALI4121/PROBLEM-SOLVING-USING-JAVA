package E_CONTROL_FLOW_STATEMENTS.NESTED_LOOP;

import java.util.Scanner;

class SquarePatternOfStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the size of the square : ");
        int size = input.nextInt();

        //print the square pattern of stars
        for(int i = 0; i<size; i++){ // Loop for each row
            for (int j = 0; j<size; j++){ // Loop for each column
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println();
        }

    }
}
