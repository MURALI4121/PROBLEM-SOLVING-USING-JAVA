package H_STRINGS;


import java.util.Scanner;

class StringReversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String to Reverse ");
        String string = scanner.nextLine();

        //reversing a string using first method
        StringBuilder reverse = reverseString(string);
        System.out.println("Reversed string using method1 : " + reverse);

        //Reversing a string using second method
        StringBuilder reversedString = StringRevers(string);
        System.out.println("Reversed string using method 2: " + reversedString );
    }

    //method one to reverse a string

    public static StringBuilder reverseString(String string) {

        //Create an empty StringBuilder to hold the reversed String
        StringBuilder reversedString = new StringBuilder();

        //Loop through the input string from the last character to first
        for (int i = string.length() - 1; i >= 0; i--) {
            //append each character to the reversedString
            reversedString.append(string.charAt(i));
        }
        return reversedString;
    }

    // method two to reverse a string

    public static StringBuilder StringRevers(String string){

        //Create a StringBuilder instance with the input string
        StringBuilder sb = new StringBuilder(string);

        //Use the reverse() method of the StringBuild instance
        sb.reverse();

        return sb;
    }
}
