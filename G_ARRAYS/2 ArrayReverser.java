package G_ARRAYS;

class ArrayReverser {
    public static void main(String[] args) {
        // initialize an example array
        int[] myArray = {1,2,3,4,5,6};

        // Print original array
        System.out.println("Original Array : ");
        printArray(myArray);

        //Reverse te array
        reversedArray(myArray);

        //Print the reversed array
        System.out.println("Reversed array: ");
        printArray(myArray);
    }

    //method to reverse an array
    public static void reversedArray(int[] array){

        int start = 0; //Start index
        int end = array.length-1; //End index

        while(start < end){

            //swap the elements ata start and end indexes

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            //Move the indexes towards the center
            start++;
            end--;
        }
    }

    // Method to print elements of the array
    public static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
