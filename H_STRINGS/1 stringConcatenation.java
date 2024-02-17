package H_STRINGS;

import java.util.Scanner;

class stringConcatenation {
    public static void main(String[] args) {
        //Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the first thing
        System.out.println("Enter your First Name");
        String firstName = scanner.next();

        //prompt the user to enter the second String
        System.out.println("Enter your Second Name");
        String secondName = scanner.next();

        //Concatenate the wo Strings
        String concatenatedString = firstName+secondName;

        //Display the result
        System.out.println("After concatenating two strings" + concatenatedString);
    }
}
