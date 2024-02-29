package LEETCODE_ARRAYS;

public class SecondSmallestAndSecondLargest {
    static int SecondSmallest(int[] arr, int n){
        // approach 1 - bruteForce
//        Arrays.sort(arr);
//
//        int SSmallest = arr[1];
//        int SLargest = arr[n-2];
//
//        System.out.println("Second Smallest is " + SSmallest);
//        System.out.println("Second largest is  " + SLargest );


        //Approach 2 - optimal solution
        //checking base case
        if(n<2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if(arr[i] < small){
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }

    static int SecondLargest(int[] arr, int n){
        if(n<2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i] > largest){
                SecondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > SecondLargest && arr[i] != largest) {
                SecondLargest = arr[i];
            }

        }
        return SecondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,5};
        int n = arr.length;
        int Ssmall = SecondSmallest(arr,n);
        int Slargest = SecondLargest(arr,n);
        System.out.println("the Second smallest element is : " + Ssmall);
        System.out.println("The Second largest element is : " + Slargest);

    }
}
