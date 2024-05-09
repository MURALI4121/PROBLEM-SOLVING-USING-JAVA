package Q_RECURSION_AND_BACKTRACKING;

class ReverseNumber {
    //Check if the number is negative to handle it properly
    public static int reverse(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number; //make the number positive fot processing
        }

        //Start the recursion
        int reversed = reverseRecursive(number);

        //if the original number was negative, make the result negative
        return isNegative ? -reversed : reversed;

    }

    static int reverseRecursive(int number) {
        //Recursive logic using the length of the number
        // calculate the number of digits
        int numDigits = (int) (Math.log10(number) + 1);

        if (number < 10) {
            //Base Case: if the number is a single digit return it as is
            return number;
        } else {
            //Recursive case: get the last digit and add it to the reverse
            return (number % 10) * (int) Math.pow(10, numDigits - 1) + reverseRecursive(number / 10);
        }

    }

    public static void main(String[] args) {
        int number = 1234;
        int reversedNumber = reverse(number);
        System.out.println("Original : " + number);
        System.out.println("Reversed : " + reversedNumber);

        number = -987;
        reversedNumber = reverse(number);
        System.out.println("Original : " + number);
        System.out.println("Reversed : " + reversedNumber);
    }


}
