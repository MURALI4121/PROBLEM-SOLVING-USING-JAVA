package G_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        if(size <= 0){
            System.out.println("Please enter a positive size");
            return;
        }

        int[] array = new int[size];
        System.out.print("Enter " + size + " Elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        //Sorting the array
        Arrays.sort(array);

        System.out.print("Sorted Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
