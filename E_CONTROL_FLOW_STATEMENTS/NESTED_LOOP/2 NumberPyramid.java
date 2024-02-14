package E_CONTROL_FLOW_STATEMENTS.NESTED_LOOP;

import java.util.Scanner;

class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter te height of the pyramid : ");
        int height = scanner.nextInt();

        //generate the pyramid
        for (int i = 1; i<=height; i++){
            //print leading spaces
            for (int space = 1; space<=height-i; space++){
                System.out.print(" ");
            }
            // print numbers
            for (int j = 1; j<= i; j++){
                System.out.print(i+ " ");
            }
            //move to the nextline
            System.out.println();
        }

    }
}
