package G_ARRAYS;

class ShiftingAllZeroesToEnd {

    public static void main(String[] args) {
        int[] numbers = {0,1,0,3,12};

        shiftZeroesToEnd(numbers);

        //Print the array after shifting zeroes
        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void shiftZeroesToEnd(int[] numbers){
        int index = 0; // pointer to place the next non-zero element

        //Move to non-zero elements to the front of array

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0){
                numbers[index++] = numbers[i];
            }
        }

        //Fill remaining positions with zeroes
        while(index< numbers.length){
            numbers[index++]=0;
        }
    }

}
