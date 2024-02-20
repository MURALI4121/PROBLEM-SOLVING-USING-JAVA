package J_RECURSION_AND_BACKTRACKING;

class ReverseAnArrayUsingRecursion {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6};
        ArrayReverse(Array,0, Array.length-1);

        //Print the reversed Array
        for (int i = 0; i<Array.length; i++){
            System.out.print(Array[i] + " ");
        }

    }

    public static void ArrayReverse(int[] array, int start, int end) {
        // Base condition : when start index is equal or greater than index
        if (start >= end) {
            return;
        }

        //Swap elements Start and end indexes
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        //Recursive call with reduced range
        ArrayReverse(array, start + 1, end - 1);

    }

}
