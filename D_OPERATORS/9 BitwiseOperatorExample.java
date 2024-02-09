package D_OPERATORS;

 class BitwiseOperatorExample {
     public static void main(String[] args) {
         int number = 4; //

         //Multiply by 2 using left shift
         int multiplied = number << 1 ;
         System.out.println(number + "multiplied by 2 is "+ multiplied);

         //Divide by 2 using right shift
         int divided = number>>1;
         System.out.println(number + "divide by 2 is "+ divided);

         // Demonstrate with a negative number
         int negativeNumber = -4;
         int negMultiplied = negativeNumber << 1; // Multiply by 2
         int negDivided = negativeNumber >> 1; // Divide by 2
         System.out.println(negativeNumber + " multiplied by 2 is " + negMultiplied);
         System.out.println(negativeNumber + " divided by 2 is " + negDivided);
     }
}
