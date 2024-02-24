package L_SORTING;

class InsertionSortExample{

    void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;

        }
    }

    void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");

        }
    }
    public static void main(String[] args) {

        InsertionSortExample insert = new InsertionSortExample();
        int[] array = {3, 5, 8, 12, 15};

        insert.insertionSort(array);

        insert.printArray(array);


    }

}
