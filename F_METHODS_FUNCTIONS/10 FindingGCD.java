package F_METHODS_FUNCTIONS;

import java.util.Scanner;

class FindingGCD {


    public static int findGCD(int a,int b){
        while(b != 0){
            int temp = b;
            b= a % b;//Replace b with the remainder of a divided by b
            a = temp;// Replace a with b
        }
        return a; // when b is 0, a is the GCD



    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your first number");
        int num1 = input.nextInt();

        System.out.println("enter your second number");
        int num2 = input.nextInt();

        int result = findGCD(num1,num2);

        System.out.println(" the gcd of given numbers is : " + result);


    }
}
