package F_METHODS_FUNCTIONS;

import java.util.Scanner;

class ArrayEqualityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = {1,2,3,};


        System.out.println("arr1 and arr2 are equal :  " + AreEqual(arr1,arr2) );
        System.out.println("arr1 and arr2 are equal :  " + AreEqual(arr1,arr3) );

    }


    public static boolean AreEqual(int[] array1, int[] array2){
        // Check if both arrays are equal are the same object or both are null
        if(array1 == array2){
            return true;
        }

        // if either array is null (but not both, since that case is handled above), they are not equal

        if(array1 == null || array2 == null){
            return false;
        }

        // Check if arrays have different lengths

        if(array1.length != array2.length){
            return false;
        }

        // Check each element in the array for equality

        for(int i = 0; i<array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }

        return true;
    }
}
