package C_INPUT_AND_OUTPUT;

import java.util.Scanner;

class namePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name : ");
        String firstname = input.next();

        System.out.println("Enter your Second name : ");
        String lastname  = input.next();

        String fullName = firstname + " " + lastname;

        System.out.println("The full name is " + fullName);

    }

}
