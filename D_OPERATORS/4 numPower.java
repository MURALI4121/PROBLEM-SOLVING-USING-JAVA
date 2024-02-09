package D_OPERATORS;

class numPower {

    public static void main(String[] args) {

        double base = 4;
        double exponent = 2;


        // calculating power using a loop (arithmetic operator)
        double result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println("the power of given number is : " + result);

        //using Math.pow()
        double power = Math.pow(base,exponent);
        System.out.println("the power calculator using math.pow" + power);


    }
}
