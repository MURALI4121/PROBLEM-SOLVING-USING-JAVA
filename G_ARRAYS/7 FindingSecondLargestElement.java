package G_ARRAYS;
class FindingSecondLargestElement {
    public static void main(String[] args) {
        int[] array = {3, 45, 6, 12, 45, 9};
        secondLargest(array);

    }

    public static void secondLargest(int[] array){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
             int number = array[i];

             //Update the largest and second largest

            if(number>largest){
                secondLargest = largest;
                largest = number;
            } else if (number>secondLargest && number !=largest)  {
                secondLargest = number;

            }

        }

        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("there is no second largest number or all elements are equal");
        }else{
            System.out.println("the second largest number is " + secondLargest);
        }
    }
}

// this is how the iteration works
 /*
 Initialization: largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE.

First Iteration (number = 3):

3 > Integer.MIN_VALUE (True), so secondLargest = Integer.MIN_VALUE, largest = 3.

Second Iteration (number = 45):
45 > 3 (True), so secondLargest = 3, largest = 45.

Third Iteration (number = 6):
6 > 45 (False), so it checks the next condition.
6 > 3 and 6 != 45 (True), so secondLargest = 6. (The largest remains 45).

Fourth Iteration (number = 12):
12 > 45 (False), so it checks the next condition.
12 > 6 and 12 != 45 (True), so secondLargest = 12.

Fifth Iteration (number = 45):
45 > 45 (False), so it checks the next condition.
45 > 12 and 45 != 45 (False), no update occurs since this number is equal to the current largest.

Sixth Iteration (number = 9):
9 > 45 (False), so it checks the next condition.
9 > 12 (False), so neither largest nor secondLargest are updated
  */
