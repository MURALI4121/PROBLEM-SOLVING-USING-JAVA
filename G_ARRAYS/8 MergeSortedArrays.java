package G_ARRAYS;

class MergeSortedArrays {
    public static void main(String[] args) {
        int[] sortedArray1 = {1, 3, 5, 7};
        int[] sortedArray2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeSortedArrays(sortedArray1, sortedArray2);

        // Print the merged sorted array
        System.out.println("Merged Sorted Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and add the smaller one to the result
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        // Copy remaining elements from the first array if any
        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        // Copy remaining elements from the second array if any
        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;
    }
}
