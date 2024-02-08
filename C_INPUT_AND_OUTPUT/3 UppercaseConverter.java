package C_INPUT_AND_OUTPUT;

import java.util.Scanner;

class UppercaseConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line :  ");

        //Read the text from the user
        String line = input.next();

        //convert the text to uppercase
        String uppercase = line.toUpperCase();

        //print the uppercase text
        System.out.println("the uppercase of your line is : " + uppercase );
    }
}
