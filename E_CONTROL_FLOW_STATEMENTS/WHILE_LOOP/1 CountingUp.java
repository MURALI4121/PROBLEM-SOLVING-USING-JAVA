package E_CONTROL_FLOW_STATEMENTS.WHILE_LOOP;

class CountingUp {
    public static void main(String[] args) {

        int number = 1;//Start counting from 1
        while(number<=100){ // continue looping as long as number is less than or equal to 100
            System.out.println(number);// Print the current number
                number++; // Increment the number by 1
        }
    }
}
