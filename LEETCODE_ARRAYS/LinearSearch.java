package LEETCODE_ARRAYS;

 class LinearSearch {

     public static int linearSearch(int[] arr, int num){
         int n = arr.length;

         for (int i = 0; i < n; i++) {
             if(arr[i] == num){
                 return i;
             }
         }

         return -1;
     }

     public static void main(String[] args) {
         int[] arr = {6,7,8,4,1};
         int num = 4;

         int output = linearSearch(arr,num);

         System.out.println(" the index num present is " + output);
     }
}
