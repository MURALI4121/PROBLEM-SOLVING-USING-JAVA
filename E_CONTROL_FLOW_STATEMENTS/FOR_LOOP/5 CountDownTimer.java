package E_CONTROL_FLOW_STATEMENTS.FOR_LOOP;

import java.util.Scanner;

class CountDownTimer {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Start the timer ");
        int timer = input.nextInt();

        if(timer < 1){
            System.out.println("please enter positive value");
        }

        try{
            for (int i = timer; i >= 1; i--) {
                Thread.sleep(1000); //Delay for one second
                System.out.println(i);
            }
            System.out.println("CountDown Finished");
        }catch(InterruptedException e){
            System.out.println("The countdown was interrupted");
        }

        //We used the try-catch block to handle `InterruptedException`,
        // which `Thread.sleep()`may throw if the thread is interrupted while sleeping.
    }
}
