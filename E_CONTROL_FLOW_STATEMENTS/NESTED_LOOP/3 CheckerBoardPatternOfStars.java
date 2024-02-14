package E_CONTROL_FLOW_STATEMENTS.NESTED_LOOP;

import java.util.Scanner;

class CheckerBoardPatternOfStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the pattern size");
        int pattern = input.nextInt();

        for (int i = 0; i <=pattern; i++) {
            for (int j = 0; j <=pattern; j++) {
                if ((i+j)%2 ==0){
                    System.out.print( "*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();


        }
    }
}
