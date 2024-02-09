package C_INPUT_AND_OUTPUT;

import java.util.Scanner;

class StringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your String");
        String string = input.next();

        //calculate the length of the string
        int length = string.length();

        System.out.println("the length of the string is : " +length+ "letters" );
    }
}
