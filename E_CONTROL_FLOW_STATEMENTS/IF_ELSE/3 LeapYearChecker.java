package E_CONTROL_FLOW_STATEMENTS.IF_ELSE;

import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year : ");
        double year = input.nextInt();

        if (year %4 == 0 || year % 400 == 0 && year % 100 !=0 ){
            System.out.println("it is a leap year ");
        }else{
            System.out.println("it is not an leap year");
        }
    }
}
