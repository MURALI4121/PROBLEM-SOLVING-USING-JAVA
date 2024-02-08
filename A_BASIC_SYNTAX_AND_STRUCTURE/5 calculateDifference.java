package A_BASIC_SYNTAX_AND_STRUCTURE;

class calculateDifference {

    public static void calcDiff(int num1, int num2) {
        int difference = num1 - num2;
        System.out.println("the difference between tow numbers is " + difference);

    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 12;

        calcDiff(num1, num2);
    }
}
