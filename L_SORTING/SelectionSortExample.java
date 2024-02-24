package L_SORTING;

public class SelectionSortExample {


    void SelectionSort(int[] arr){
        int n = arr.length;

        // outer loop to sort the unsorted array
        for (int i = 0; i < n-1; i++) {
            // initialize a variable to find minimum index
            int min_idx = i;
            for(int j = i+1; j<n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
           arr[min_idx] = arr[i];
           arr[i] = temp;
        }
    }
    void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        SelectionSortExample sort = new SelectionSortExample();
        int [] array = {29,10,14,37,13};
        sort.SelectionSort(array);
        System.out.print("Array after sorted : ");
        sort.printArray(array);
    }
}
