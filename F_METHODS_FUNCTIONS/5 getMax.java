package F_METHODS_FUNCTIONS;

import java.util.Scanner;

class getMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        double num1 = scanner.nextDouble();

        System.out.println("please enter Second number ");
        double num2 = scanner.nextDouble();

        System.out.println("please enter Third number");
        double num3 = scanner.nextDouble();

        double result = GetMax(num1,num2,num3);

        System.out.println("the max num in given numbers is " + result);


    }

    public static double GetMax(double num1,double num2,double num3){
        if (num1 > num2 && num1>num3){
            return num1;
        } else if (num2>num3) {
            return num2;
        }else {
            return num3;
        }
    }
}
