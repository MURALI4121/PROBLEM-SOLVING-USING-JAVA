package L_SORTING;

public class RecursiveInsertionSort {

    void insertionSort (int arr[], int n,int i){
        // Base Case i == n
        if(i == n)  return;

        int j = i;
        while (j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertionSort(arr , n , i+1);

    }
    public static void main(String[] args) {
        RecursiveInsertionSort Bs = new RecursiveInsertionSort();

        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("Before using insertion sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Bs.insertionSort(arr,n,0);

        System.out.println(" After InsertionSort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
