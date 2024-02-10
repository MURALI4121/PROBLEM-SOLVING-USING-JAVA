package E_CONTROL_FLOW_STATEMENTS.IF_ELSE;

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter u r number :");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("u r number is even ");
        }else {
            System.out.println("u r num is odd");
        }

        String num = number %2 == 0 ? "EVEN":"ODD";
        System.out.println(num);
    }
}
