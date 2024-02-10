package E_CONTROL_FLOW_STATEMENTS.IF_ELSE;

import java.util.Scanner;

class GradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your marks : ");
        double marks = input.nextDouble();

        //using if else statements
        if (marks >= 90) {
            System.out.println("Congrats your grade is A");
        } else if (marks >= 80) {
            System.out.println("your grade is B");
        } else if (marks >= 70) {
            System.out.println("your grade is C");
        } else if (marks >= 60) {
            System.out.println("your grade is D");
        } else {
            System.out.println("Your grade is E");
        }

        //using ternary operator
        String grade = (marks >= 90) ? " grade A" :
                (marks >= 80) ? "grade b" :
                        (marks >= 70) ? "grade C" :
                                (marks >= 60) ? "grade d" :
                                        "grade f you failed";
        System.out.println(grade);
    }
}
