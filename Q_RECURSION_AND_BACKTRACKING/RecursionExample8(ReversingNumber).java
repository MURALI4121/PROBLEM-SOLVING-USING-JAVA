package Q_RECURSION_AND_BACKTRACKING;

class ReversingNumber {

    // Helper method to initiate recursion with additional parameters

    public static int reverse(int number){
        //Kick off the recursive function with an initial reverse of 0

        return reverseRecursive(number,0);
    }

    //Recursive method to reverse digits

    static int reverseRecursive(int number, int reversed){

        if(number == 0){
            //Base case : Shift reversed left and add the last digits of number
            return reversed;
        }
        else{
            //Recursive case : shift reversed left and add the last digit of number
            return reverseRecursive(number/10 , reversed*10 + number%10);
        }

    }

    public static void main(String[] args) {
        int number = 1234;
        int reversedNUmber = reverse(number);
        System.out.println("Original: " + number);
        System.out.println("Reversed: " + reversedNUmber);
    }
}
