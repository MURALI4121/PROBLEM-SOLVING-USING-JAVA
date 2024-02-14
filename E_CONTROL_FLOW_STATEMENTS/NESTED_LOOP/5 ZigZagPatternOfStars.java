package E_CONTROL_FLOW_STATEMENTS.NESTED_LOOP;

import java.util.Scanner;

class ZigZagPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                // For every row, calculate the position to print star
                if ((i + j) % 4 == 0 || (i % 4 == 0 && j % 4 == 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
