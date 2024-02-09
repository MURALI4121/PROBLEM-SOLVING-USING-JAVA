package D_OPERATORS;

import java.util.Scanner;

class NumberRange {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = input.nextInt();


        // This demonstrates AND-&& operator
        // The AND operation (&&) returns true only when both conditions it checks are true;
        //if either or both are false, it returns false.
        if(number >= 20 && number<=50){
            System.out.println("the number is within the range ");
        }else {
            System.out.println("the number is not in the range");
        }

        // This demonstrates || operator
        //the OR operation (||) evaluates to true if at least one of the operands (conditions) is true;
        // otherwise, it evaluates to false.
        if (number < 20 || number > 50) {
            System.out.println(" the number is not in the range");
        } else {
            System.out.println("the number is with in the range");

        }

        // This demonstrates ! operator
        // Operation: !true evaluates to false, and !false evaluates to true
        if (!(number < 20 || number > 50)) {
            System.out.println(" the number is not in the range");
        } else {
            System.out.println("the number is with in the range");

        }



    }
}

