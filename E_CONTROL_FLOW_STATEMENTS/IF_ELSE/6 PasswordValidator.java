package E_CONTROL_FLOW_STATEMENTS.IF_ELSE;

import java.util.Scanner;

class PasswordValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your password");
        String password = input.next();

        if(isValidPassword(password)){
            System.out.println("password is valid ");
        }else {
            System.out.println("password is invalid");
        }

    }

    public static boolean isValidPassword(String password){

        if (password.length() < 8){
            return false; // password too short
        }

        boolean hasNumber = false;
        boolean hasLower = false;
        boolean hasUpper = false;

        for (int i = 0; i<password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)){
                hasNumber = true;
            }
            if(Character.isLowerCase(ch)){
                hasLower = true;
            }
            if(Character.isUpperCase(ch)){
                hasUpper = true;
            }
            if (hasNumber && hasLower && hasUpper) {
                return true;
            }
        }
        return false;
    }


}

