package C_INPUT_AND_OUTPUT;

import java.util.Scanner;

class ageChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take input from user
        System.out.print("Enter your age : ");
        int age = input.nextInt(); //read the age

        // check the user is eligible to vote or not

        if(age >= 18){
            System.out.println("Your eligible to vote please go and vote");

        }else{
            System.out.println("sorry buddy your not eligible to vote");
        }

    }
}
