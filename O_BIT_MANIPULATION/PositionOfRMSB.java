package O_BIT_MANIPULATION;

import java.util.Scanner;

public class PositionOfRMSB {



//   This approach is good but the time complexity is O(log N)
//   we can solve this in O(1) time complexity

//    static int posOfRMSB(int n) {
//        int m = 1;
//        int pos = 0;
//
//        if (n == 0) {
//            return -1;
//        }
//        while ((n & m) == 0) {
//            m = m << 1;
//            pos++;
//        }
//        return pos + 1;


    // This is the O(1) Approach

    static int posOfRMSB(int n){
        return (int) (Math.log10(n ^ (n & (n-1)))/Math.log10(2))+1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        System.out.println(posOfRMSB(n));
    }
}
