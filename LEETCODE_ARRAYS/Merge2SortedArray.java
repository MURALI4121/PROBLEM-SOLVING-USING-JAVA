package LEETCODE_ARRAYS;

import java.util.ArrayList;
import java.util.HashSet;

public class Merge2SortedArray {

    public static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {// add the both array element unique values to this array as it only stores unique elements
        int i = 0;
        int j = 0; //two pointers

        ArrayList<Integer> Union = new ArrayList<>(); // this is union Array

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
            // Edge Cases
            // if any element left in arr1
            while (i < n) {
                if (Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            }

            //if any elements left in arr2
            while (j < m) {
                if (Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }

        return Union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> result = FindUnion(arr1, arr2, n, m);
        System.out.println("The union of two arrays is ");
        for (int i = 0; i < result.size(); i++) {
            int val = result.get(i);
            System.out.print(val + " ");
        }

    }
}
