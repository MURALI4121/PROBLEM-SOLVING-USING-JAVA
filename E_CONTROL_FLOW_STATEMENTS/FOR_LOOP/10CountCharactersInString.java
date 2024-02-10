package E_CONTROL_FLOW_STATEMENTS.FOR_LOOP;

import java.util.Scanner;

class CountCharactersInString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the string");
        String name = input.next();

        int count = 0;
        for (int i = 1; i <name.length() ; i++) {
            System.out.print(i);
            count++;
        }
    }
}
