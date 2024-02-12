package E_CONTROL_FLOW_STATEMENTS.WHILE_LOOP;

import java.util.Scanner;

class GCDcalculator {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter First number");
       int num1 = scanner.nextInt();

        System.out.println("Enter Second Number");
        int num2 = scanner.nextInt();
        
        int gcd;
        if(num1<num2){
            gcd = num1;
        }else{
          gcd = num2;
        }
        

        while(gcd>0){
            if(num1 % gcd == 0 && num2 % gcd == 0 ){
                break;
            }
            gcd--;
            
        }
        System.out.println("the gcd of two numbers is : " + gcd);
    }
}
