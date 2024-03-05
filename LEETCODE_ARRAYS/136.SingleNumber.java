package LEETCODE_ARRAYS;

import java.util.HashMap;
import java.util.Map;

class SingleNumber {

    //This is Brute force approach time complexity is O(n^2)
//    public static int getSingleElement(int[] arr) {
//        // Size of the array:
//        int n = arr.length;
//
//        //Run a loop for selecting elements:
//        for (int i = 0; i < n; i++) {
//            int num = arr[i]; // selected element
//            int cnt = 0;
//
//            //find the occurrence using linear search:
//            for (int j = 0; j < n; j++) {
//                if (arr[j] == num)
//                    cnt++;
//            }
//
//            // if the occurrence is 1 return ans:
//            if (cnt == 1) return num;
//        }
//
//        //This line will never execute
//        //if the array contains a single element.
//        return -1;
//    }
//


    //This is Better approach time complexity is O(N*logM) + O(M)
//    public static int getSingleElement(int[] arr) {
//        // size of the array
//        int n = arr.length;
//
//        //Declare the hashmap
//        // and hash the given array
//        HashMap <Integer , Integer> mpp = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            int value = mpp.getOrDefault(arr[i], 0);
//            mpp.put(arr[i], value+1);
//        }
//        // Find the singe element and return the answer:
//        for (Map.Entry<Integer,Integer> it : mpp.entrySet()) {
//            if(it.getValue() == 1){
//                return it.getKey();
//            }
//
//        }
//        return -1;
//    }

    //This is Optimal approach time complexity is O(N)
    public static int getSingleElement(int[] arr) {

        // size of the array
        int n = arr.length;

        // XOR all the elements
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }

        return xorr;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}
