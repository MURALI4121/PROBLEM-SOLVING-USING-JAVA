package J_RECURSION_AND_BACKTRACKING;

import java.util.Scanner;

public class PalindromeCheckerUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String to check if it's a palindrome:");
        String str = scanner.nextLine();

        // Call isPalindrome with initial start and end values
        boolean res = isPalindrome(str, 0, str.length() - 1);

        if (res) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: If start index crosses end index or they are the same (for odd length strings)
        if (start >= end) {
            return true;
        }

        // Check if characters at start and end are not equal
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Move towards the center of the string
        return isPalindrome(str, start + 1, end - 1);
    }
}
