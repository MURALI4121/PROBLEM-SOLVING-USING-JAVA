package F_METHODS_FUNCTIONS;

import java.util.Scanner;

class StringPalindromeChecker {


    public static boolean isPalindrome(String input){

        //Remove non-alphaNumeric characters and convert to lowercase for uniform comparison
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left = 0; // Start Pointer
        int right = cleanedInput.length()-1; // End pointer

        //Check for palindrome

        while(left<right){
            if(cleanedInput.charAt(left) != cleanedInput.charAt(right)){
                //Charecters at left and right do not match , so its not palindrome
                return false;
            }

            // move towards the center

            left++;
            right--;


        }
        //if we reach here, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a string to check");
        String name = scanner.next();

        System.out.println(" is " + name +" palindrome ...? that is :"+ isPalindrome(name));

    }
}
