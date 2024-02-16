package G_ARRAYS;

class ArrayComparator {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4,5,6};
        int[] array3 = {1,2,3};



        System.out.println("array1 and array2 is equal that is : " + areEqual(array1,array2));
        System.out.println("array1 and array3 is equal that is : " + areEqual(array1,array3));
    }

    public static boolean areEqual(int[] array1, int[] array2){
        if(array1 == array2){
            return true;
        }

        if(array1 == null || array2 == null){
            return false;
        }

        if(array1.length != array2.length){
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]){
                return false;
            }

        }
        return true;
    }
}
