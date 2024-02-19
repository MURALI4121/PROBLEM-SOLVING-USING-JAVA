package I_TIME_AND_SPACE_COMPLEXITY;

// Define a public class named PalindromeCheck
class PalindromeCheck {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Initialize a string
        String s = "radar";

        // Print the result of the isPalindrome method
        System.out.println("Is '" + s + "' a palindrome? " + isPalindrome(s));
    }

    // Method to check if a given string is a palindrome
    // Takes a string as a parameter
    public static boolean isPalindrome(String s) {
        int left = 0; // Index of the first character
        int right = s.length() - 1; // Index of the last character

        // Loop until the two indices meet in the middle
        while (left < right) {
            // If the characters at the current indices do not match,
            // the string is not a palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            // Move the indices towards the center
            left++;
            right--;
        }

        // If the loop completes without finding a mismatch,
        // the string is a palindrome
        return true;
    }
    // Time Complexity: O(n/2) simplifies to O(n), where n is the length of the string.
    // The loop iterates through at most n/2 characters (half the string),
    // checking characters from both ends towards the center.

    // Space Complexity: O(1), constant space.
    // The space used by the algorithm does not depend on the input size.
    // Only two integer variables (left and right) are used, regardless of the string length.
}

