package E_CONTROL_FLOW_STATEMENTS.NESTED_LOOP;

import java.util.Scanner;

class DiamondPatternWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the middle number of the diamond: ");
        int middle = scanner.nextInt(); // This will be the widest point and the number in the middle row

        // Upper half including the middle
        for (int i = 1; i <= middle; i++) {
            // Print spaces before the numbers for alignment
            for (int s = middle - i; s > 0; s--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Lower half
        for (int i = middle - 1; i >= 1; i--) {
            // Print spaces before the numbers for alignment
            for (int s = middle - i; s > 0; s--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
