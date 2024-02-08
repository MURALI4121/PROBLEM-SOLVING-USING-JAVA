package C_INPUT_AND_OUTPUT;


import java.sql.SQLOutput;
import java.util.Scanner;

class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = input.next();
        System.out.println("Hello " + name);


    }
}
