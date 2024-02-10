package E_CONTROL_FLOW_STATEMENTS.FOR_LOOP;

import java.util.Scanner;

class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("tell me how many numbers you want to enter");
        int count = input.nextInt();

        if(count < 0){
            System.out.println("please enter the positive number");
        }

        // loop to take "count" numbers as input
        double sum = 0;
        for (int i=1; i<=count; i++){
            System.out.println("Enter the num" + i + " :");
            // add each input number to the sum
            sum = sum + input.nextInt();
        }
        //Calculate the average by dividing the sum by the count of the numbers
        double average = sum/count;

        System.out.println("the average of numbers is : " + average);


    }
}
