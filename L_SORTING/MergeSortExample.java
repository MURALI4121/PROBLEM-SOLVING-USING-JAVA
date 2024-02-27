package L_SORTING;

import java.util.ArrayList;

class MergeSortExample{

    private static void merge(int[] arr,int low,int mid, int high){

        ArrayList<Integer> temp = new ArrayList<>(); // created a temporary array to store the values
        int left = low;// Starting index of left half of the array
        int right = mid+1; // Starting index of right half of arr

        //storing elements in the temporary in a sorted manner
        while (left <= mid && right <=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        //if the elements on the left half are still left

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        //if the elements on the right half are still left
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        //transferring all elements from temporary to arr

        for(int i = low; i<= high; i++){
            arr[i] = temp.get(i-low);
        }
    }

    private static void mergeSort(int[] arr,int low,int high){
        if ( low >= high){
            return;
        }
        int mid = (low + high) / 2 ;
        mergeSort(arr, low,mid);
        mergeSort(arr,mid+1, high);
        merge(arr,low,mid,high);
    }

    public static void main(String[] args) {

        int n = 8;

        int arr[] = {9,3,7,5,6,4,8,2};
        System.out.println(" print the array before sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        MergeSortExample.mergeSort(arr,0,n-1);
        System.out.println(" array after sorting:  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();


    }
}