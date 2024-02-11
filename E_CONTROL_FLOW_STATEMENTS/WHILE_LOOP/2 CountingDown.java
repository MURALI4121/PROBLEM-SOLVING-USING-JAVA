package E_CONTROL_FLOW_STATEMENTS.WHILE_LOOP;

class CountingDown {
    public static void main(String[] args) {

        int num = 100; // Start counting from 100

        while(num>=1){ // Continue looping as long as num is greater than or equal to 1
            System.out.println(num);//print the current number
            num--;//decrement by 1
        }
    }
}
