package F_METHODS_FUNCTIONS;

import java.util.Scanner;

class countVowels {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println(" Enter the Name ");
         String name = scanner.next();

         System.out.println("no of vowels in " + name + " is " + CountVowels(name));
     }

     public static int CountVowels(String name){
            int count = 0;

            String inputLower = name.toLowerCase();

            for (int i= 0; i<inputLower.length(); i++){
                char ch = inputLower.charAt(i);

                //Check if the character is  a vowel

                if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch =='o'||ch=='u'){
                    count++;
                }
            }
         return count;
     }
}
