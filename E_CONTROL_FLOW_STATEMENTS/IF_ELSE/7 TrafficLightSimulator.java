package E_CONTROL_FLOW_STATEMENTS.IF_ELSE;


import java.util.Scanner;

class TrafficLightSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the traffic colour");
        String color = input.next().toLowerCase();

        if ("red".equals(color)){
            System.out.println("please stop");
        }else if("yellow".equals(color)){
            System.out.println("Caution");
        } else if ("green".equals(color)) {
            System.out.println("please goo");
        } else {
            System.out.println("enter correct color");
        }

    }

}
