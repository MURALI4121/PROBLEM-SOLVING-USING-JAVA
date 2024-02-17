package H_STRINGS;

import java.util.Scanner;

class stringPalindrome {
    public static void main(String[] args) {
        //Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter a string
        System.out.println("enter a String to check");
        String palindrome = scanner.next().toLowerCase();

        //Check if the normalized string is a palindrome
        boolean isPalindrome = isPalindrome(palindrome);

        //Display the result
        System.out.println("The given string " + palindrome + " is " + (isPalindrome ? "":"not ")+ "a palindrome");
    }

    public static boolean isPalindrome(String palindrome) {

        int left = 0;
        int right = palindrome.length() - 1;

        while (left < right) {
            if (palindrome.charAt(left) != palindrome.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
