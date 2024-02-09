package C_INPUT_AND_OUTPUT;

import java.util.Scanner;

public class VowelOrConsonantChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your letter : ");

        String letter = input.next().toLowerCase();

        if(letter.length()>1){
            System.out.println("error please enter only one charecter");
        }else{
            char ch = letter.charAt(0);
            //check if the input charecter is a vowel or constant
            if (ch == 'a' || ch =='e' || ch == 'i'|| ch == 'o' || ch == 'u'){
                System.out.println(ch + " is a vowel");
            }else if (ch >= 'a' && ch<= 'z'){
                //Assuming the input is an English alphabet letter
                System.out.println(ch + " is a consonant");
            }else{
                //the input is ot an alphabet letter
                System.out.println("Error : Input is not a letter");
            }
        }



    }
}
