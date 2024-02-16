package G_ARRAYS;

class RemovingDuplicates {
    public static void main(String[] args) {
        int[] originalArray = {1,3,5,3,7,9,1,9};

        int[] resultArray = removeDuplicates(originalArray);

        System.out.println("array without duplicates : ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]+" ");
        }

    }

    public static int[] removeDuplicates(int[] originalArray) {
        int end = originalArray.length;

        //Calculate the maximum number of unique elements

        for(int i = 0; i<end; i++){
            for(int j = i+1; j<end; j++){
                if(originalArray[i] == originalArray[j]){
                    originalArray[j] = originalArray[end-1];

                    end--;
                    j--;
                }
            }
        }

        //Copy unique elements into a new array

        int[] newArray= new int[end];

        for (int i = 0; i< end; i++){
            newArray[i] = originalArray[i];
        }
        return newArray;
    }
}
