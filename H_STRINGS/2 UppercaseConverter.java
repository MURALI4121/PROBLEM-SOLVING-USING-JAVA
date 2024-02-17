package H_STRINGS;

import java.util.Scanner;

class UppercaseConverter {
    public static void main(String[] args) {
        //Create a scanner object to read the input given by user
        Scanner scanner = new Scanner(System.in);

        //Prompt te user to enter name
        System.out.println("Enter a Name");
        String name = scanner.next();

        //Print the given name after converting to uppercase
        String after = upperCase(name);
        System.out.println("After Converting uppercase : " + after);

    }

    //method to convert uppercase
    public static String upperCase(String name){
        return name.toUpperCase();
    }
}
