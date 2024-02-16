package G_ARRAYS;

class SumOfAnArray {
    public static void main(String[] args) {
        //initialize an array
        int[] array = {1, 2, 3, 4, 5, 6,7,8,9,10};

        //Call the method to calculate sum
        int sum = calculateSum(array);

        //Print the sum of the array elements
        System.out.println("the sum of an array is " + sum);
    }

    //Method to calculate the sum of array elements
    public static int calculateSum(int[] array){
        int sum = 0;//initialize sum to 0
        for (int i = 0; i < array.length; i++) {
            sum += array[i];// Add each element to sum
        }
        return sum;// Return the calculated sum
    }

}
