package M_BINARY_SEARCH;
 class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                return mid; // Target found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }

        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;
        int result = binarySearch(arr, target);
        System.out.println("Index of " + target + " is: " + result);

    }
}
