package E_CONTROL_FLOW_STATEMENTS.IF_ELSE;

import java.util.Scanner;

class AgeGroupClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        if (age <= 12 ){
            System.out.println("you are child ");
        } else if (age <= 18) {
            System.out.println("you are a teenager");
        } else if (age <= 60) {
            System.out.println("you are a adult");

        }else {
            System.out.println("u r senior");
        }

    }
}
