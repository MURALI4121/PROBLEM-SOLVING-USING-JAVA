package G_ARRAYS;

import java.util.Random;

class FillingArrayWithRandomNumbers {

    public static void main(String[] args) {
        int size = 10; //Size of the array
        int[] numbers = new int[size]; // Create an array to hold the numbers

        fillingArrayWithRandomNumbers(numbers); // Fill the array with random numbers
        printArray(numbers);// Print the array
    }

    //method to fill array with random numbers
    public static void fillingArrayWithRandomNumbers(int[] array) {
        Random random = new Random(); // create a random object for generating random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);//assign a random number(0-99) to each element

        }
    }

    //Method to print elements of the array

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
