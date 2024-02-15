package F_METHODS_FUNCTIONS;

import java.util.Scanner;

class ConvertToCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fahrenheit temperature : ");
        double temper = scanner.nextDouble();

        double result = celsius(temper);
        System.out.println("the fahreinheit temp after converting to celcius"+result);
    }

    public static double celsius(double fahrenheit){
        return (5.0 / 9.0) * (fahrenheit-32);
    }
}
