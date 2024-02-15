package F_METHODS_FUNCTIONS;

import java.util.Scanner;

class ReverseString {

    public static String reverseString(String input){

        // Initialize a StringBuilder with the capacity of the input String
        StringBuilder reversed = new StringBuilder(input.length());

        for (int i = input.length()-1; i>=0; i--){
            reversed.append(input.charAt(i));
        }

        return reversed.toString();

    }

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter a string name");
         String name = scanner.next();



         System.out.println("the reversed string of " + name + " is : \n"+ reverseString(name));

     }

}
