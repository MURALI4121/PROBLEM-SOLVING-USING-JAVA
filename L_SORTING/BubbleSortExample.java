package L_SORTING;

class BubbleSortExample {

    void  bubbleSort(int[] arr){

        int n = arr.length;
        for (int i = 0; i < n-1; i-- ){
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
    void printArray(int[] arr){

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
    }

    public static void main(String[] args) {


        BubbleSortExample bs = new BubbleSortExample();
        int[] array = {13,46,24,52,20,9};
        bs.bubbleSort(array);

        System.out.println("Sorted Array");

        bs.printArray(array);
    }
}
