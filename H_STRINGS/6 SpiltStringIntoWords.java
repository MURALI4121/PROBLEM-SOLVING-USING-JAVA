package H_STRINGS;

import java.util.Arrays;
import java.util.Scanner;

class SpiltStringIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String to split");
        String string = scanner.nextLine();

        System.out.println("after splitting into words" + splitString(string) );
    }

    //Method to splitStringIntoWords

    public static String splitString(String string){
        String newStr = Arrays.toString(string.split("\\s+"));
        return newStr;
    }
}
