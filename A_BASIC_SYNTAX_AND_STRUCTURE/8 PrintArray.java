package A_BASIC_SYNTAX_AND_STRUCTURE;

class PrintArray {

    //method to print elements of an array
    public static void printArray(int[] array) {
        //iterate through array
        for (int i = 0; i < array.length; i++) {
            //print each element
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        //Create an integer array with some values
        int[] arr = {10, 20, 25, 30, 35, 40};

        // Call the printarray method and pass the integer array as argument
        printArray(arr);
    }
}
