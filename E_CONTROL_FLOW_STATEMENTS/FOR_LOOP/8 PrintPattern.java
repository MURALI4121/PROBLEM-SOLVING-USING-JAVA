package E_CONTROL_FLOW_STATEMENTS.FOR_LOOP;

import java.util.Scanner;

class PrintPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number");
        int number = input.nextInt();

        for(int i = 0; i<number; i++){
            for (int j=number - i; j>1; j--){
                System.out.print(" ");
            }

            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
