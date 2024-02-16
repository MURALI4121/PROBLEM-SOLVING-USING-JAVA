package G_ARRAYS;

class CheckingCertainValueInArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        boolean numIsThere = certainValue(array);

        System.out.println("the given value present in the array that is : " + numIsThere);


    }

    public static boolean certainValue(int[] array){
        int value = 3;

        for (int i=0; i<array.length;i++){
            if(array[i] == value){
                return true;
            }
        }
        return false;
    }
}
