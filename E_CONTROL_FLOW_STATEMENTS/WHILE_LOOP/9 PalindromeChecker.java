package E_CONTROL_FLOW_STATEMENTS.WHILE_LOOP;

import java.util.Scanner;

class PalindromeChecker {
    public static boolean isPalindrome(int palindrome){
        if( palindrome < 0 || (palindrome % 10 ==0 && palindrome != 0)){
            return false;
        }

        int reversedHalf = 0;

        while(palindrome > reversedHalf){
            int lastDigit = palindrome % 10 ; //get the last digits
            reversedHalf = reversedHalf * 10 + lastDigit;//add it to the reversed half
            palindrome /= 10; // remove the last digit from x
        }
        // The number is a palindrome if it's the same as the reversed half
        // or the same when the middle digit is ignored (for odd number of digits)
        return palindrome == reversedHalf || palindrome == reversedHalf/10;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" please enter your integer : ");
        int palindrome = scanner.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println(palindrome + "is a palindrome");
        }else{
            System.out.println(palindrome+ "is not a palindrome");
        }




    }
}
