package E_CONTROL_FLOW_STATEMENTS.IF_ELSE;

import java.util.Scanner;

class TemperatureAdviser {

       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

           System.out.println("enter the current temperature");
           double temp = input.nextDouble();

           if(temp > 30){
               System.out.println("go to beach");
           }else if(temp > 20){
               System.out.println("go to picnic");
           } else if (temp > 10) {
               System.out.println("go to cinema");
           }else {
               System.out.println("stay at home and read  a book");
           }
       }
}
