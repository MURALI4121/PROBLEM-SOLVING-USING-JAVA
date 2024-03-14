package LEETCODE_STRINGS;

class LargestOddNumber {

    public static String LargestOddNumber(String num){
        // Iterate from the end of the string towards the begining
        for(int i = num.length()-1; i>=0; i--){
            //Convert the current character to a numeric value
            int digit = num.charAt(i) - 0;
            // Check if the digit is odd

            if(digit % 2 != 0){
                // If its odd, return the substring form the begining to this digit
                return num.substring(0,i+1);
            }
        }
        // if no odd digit is found, return an empty string
        return "";
    }
    public static void main(String[] args) {
        String num = "52";
        System.out.println(LargestOddNumber(num));

        String num1 = "4206";
        System.out.println(LargestOddNumber(num1));

        String num2 = "1357";
        System.out.println(LargestOddNumber(num2));
    }
}
