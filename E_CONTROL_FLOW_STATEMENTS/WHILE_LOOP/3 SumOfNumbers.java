package E_CONTROL_FLOW_STATEMENTS.WHILE_LOOP;

class SumOfNumbers {
    public static void main(String[] args) {

        int num = 1;//Initialize sum of numbers
        int sum = 0;//Start with the first positive integer

        while(num<=100){ // loop from 1 to 100
            sum += num; // add current number to sum
            num++; // move to the next number
        }
        System.out.println(sum); // print th sum of numbers
    }
}
