package E_CONTROL_FLOW_STATEMENTS.SWITCH_CONTINUE_BREAK;

import java.util.Scanner;

class WeeklyScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter a day of the week (1=Monday, 2=Tuesday, ..., 7=Sunday, 0=Exit):");
            int day = scanner.nextInt();

            if(day == 0){
                System.out.println("Exiting the scheduler ....");
                break;
            }
            //Use continue for invalid inputs
            if(day < 1 || day > 7){
                System.out.println("Invalid input. please enter a number between 1 and 7, or 0 to exit.");
                continue;//
            }

            switch (day){
                case 1:
                    System.out.println("Monday: Gym in the morning, work, then online course in the evening.");
                    break;
                case 2:
                    System.out.println("Tuesday: Team meeting at work, lunch with a friend, then coding practice.");
                    break;
                case 3:
                    System.out.println("Wednesday: Work, attend a webinar, then relax with a good book.");
                    break;
                case 4:
                    System.out.println("Thursday: Work, gym, then dinner with family.");
                    break;
                case 5:
                    System.out.println("Friday: Finish work tasks, movie night.");
                    break;
                case 6:
                    System.out.println("Saturday: Morning hike, grocery shopping, then visit relatives.");
                    break;
                case 7:
                    System.out.println("Sunday: Leisure activities, prepare for the upcoming week.");
                    break;
            }
        }
    }
}
