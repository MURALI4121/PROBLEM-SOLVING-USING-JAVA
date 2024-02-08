package B_VARIABLES_AND_DATATYPES;

class ArrayElements {
    public static void main ( String[] args){
        int[] arr = {2,3,5,9,15};

        int firstElement = arr[0];
        int secondElement = arr[4];

        System.out.println("the first element in the array is :" + firstElement);
        System.out.println("the second element in the array is : " + secondElement);


        // another way to print first and last elements of an array
        // Declare and initialize an array of integers
        int[] numbers = {10,15,20,25,30};

        //print the first element of the array
        System.out.println("First Element : " + numbers[0]);

        //print the second element of the array
        // use numbers.length-1 to access the last element
        System.out.println("Second Element : " + numbers[numbers.length-1]);


    }
}
