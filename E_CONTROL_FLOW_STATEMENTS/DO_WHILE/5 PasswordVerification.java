package E_CONTROL_FLOW_STATEMENTS.DO_WHILE;

import java.util.Scanner;

class PasswordVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // the correct password set to "secret"
        final String correctPassword = "secret";

        //variable to store the user's password input
        String inputPassword;

        //Do-while loop to repeatedly ask for password untill its correct

        do{
            System.out.println("enter your password : ");
            inputPassword = scanner.next();

            //check if the entered password is correct
            if(inputPassword.equals(correctPassword)){
                System.out.println("password correct. access granted");
            }else{
                System.out.println("Incorrect password. Please try again");
            }
        }while(!inputPassword.equals(correctPassword));


    }
}
