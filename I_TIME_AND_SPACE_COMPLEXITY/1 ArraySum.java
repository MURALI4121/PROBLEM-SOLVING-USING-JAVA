package I_TIME_AND_SPACE_COMPLEXITY;

// Define a public class named ArraySum
class ArraySum {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = {1, 2, 3, 4, 5};

        // Print the sum of the array by calling the arraySum method
        // and passing the array as an argument
        System.out.println("The sum of the array is: " + arraySum(array));
    }

    // Method to calculate the sum of elements in an array
    // Takes an array of integers as a parameter
    public static int arraySum(int[] array) {
        int sum = 0; // Initialize sum to 0

        // Enhanced for loop to iterate through each element of the array
        // Time Complexity: O(n), where n is the number of elements in the array.
        // This is because we need to iterate through each element once to calculate the sum.
        for (int num : array) {
            sum += num; // Add the current element to the sum
        }

        // Space Complexity: O(1), constant space.
        // This is because we use a fixed amount of space (the sum variable) regardless of the input size.
        // No additional data structures or recursive calls that grow with the size of the input.

        // Return the total sum of the array
        return sum;
    }
}
