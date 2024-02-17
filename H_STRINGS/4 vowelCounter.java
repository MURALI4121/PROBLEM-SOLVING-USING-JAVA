package H_STRINGS;

import java.util.Scanner;

class vowelCounter {
    public static void main(String[] args) {
        //create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a String
        System.out.println("Enter a String to checkVowels");
        String string = scanner.next().toLowerCase();

        //Display the result
        System.out.println("the number of vowels in the " + string + " is " + countVowels(string));


    }

    //Method to countVowels
    public static int countVowels(String string) {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;

            }


        }
        return count;
    }


}
