package G_ARRAYS;

import java.util.Scanner;

class LargestElementInAnArray {
    public static void main(String[] args) {

        //Step1 : initialize the array
        int[] Array = {1, 2, 5, 8, 2, 1};

        //Step2 : Initialize the max variable
        int max = Integer.MIN_VALUE;

        //step 3: iterate through the array to find the max value
        for (int i = 0; i < Array.length; i++) {

            if (Array[i] > max) {
                max = Array[i]; // Update the max value if current element is greater
            }

        }

        //step4 : Use or output max value
        System.out.println("the largest element in the array is: " + max);


    }
}
