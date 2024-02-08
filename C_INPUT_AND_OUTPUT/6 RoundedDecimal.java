package C_INPUT_AND_OUTPUT;

import java.util.Scanner;

class RoundedDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a floating point number");
        double number = input.nextDouble();


        //round the number to two decimal places and print it
        System.out.println("The rounded of your decimal is  " + String.format("%.2f",number));


//  * `%.2f` is used in Java to format floating-point numbers to display with exactly two digits after the decimal point.
//      Example: 3.14523654789654123 The rounded of your decimal is  3.15
//  * The `.2` in `%.2f` specifies the number of decimal places to round to, while `f` indicates that the value is a floating-point number.
//  * This format specifier is commonly used in `String.format()` and `System.out.printf()`
//     methods for rounding and displaying numbers in a readable format, especially useful for financial calculations or precise measurements.
    }
}
