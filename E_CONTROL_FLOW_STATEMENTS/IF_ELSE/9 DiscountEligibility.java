package E_CONTROL_FLOW_STATEMENTS.IF_ELSE;

import java.util.Scanner;

class DiscountEligibility {
    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);
        System.out.println("please tell the premium you have");

        String member = input.next();

        if(member.equals("premium")){
            System.out.println("20% discount");
        } else if (member.equals("gold")) {
            System.out.println("15% discount");
        } else if (member.equals("silver")){
            System.out.println("10% discount");
        } else {
            System.out.println("no discount for you");
        }
    }

}
