package L_SORTING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortExample {

    static int partition(List<Integer> arr , int low, int high){
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i<j){
            while(arr.get(i) <= pivot && i<=high - 1){
                i++;
            }
            while (arr.get(j) > pivot && j>= low+1){
                j--;
            }

            if(i<j){
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j,temp);
        return j;
    }

   static void quickSort( List<Integer> arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
   }

   public static List<Integer> QuickSort (List<Integer> arr){
        quickSort(arr,0, arr.size()-1);
        return arr;
   }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[]{4,6,2,5,7,9,1,3});
        int n = arr.size();

        System.out.println("Before Using QuickSort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        arr = QuickSortExample.QuickSort(arr);

        System.out.println("After using QuickSort : ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }



    }
}