package L_SORTING;

public class RecursiveBubbleSort {
    void bubbleSort(int[] arr, int n){

        if(n == 1){
            return;
        }

        for (int i = 0; i < n-2; i++) {
            if(arr[i] > arr[i+1] ){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, n-1);
    }

    public static void main(String[] args) {
        RecursiveBubbleSort bs = new RecursiveBubbleSort();
        int[] arr = {8,3,3,6,7,2,9};
        int n = arr.length;

        System.out.println("before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bs.bubbleSort(arr, n);

        System.out.println("after sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
