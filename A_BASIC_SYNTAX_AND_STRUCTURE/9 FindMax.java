package A_BASIC_SYNTAX_AND_STRUCTURE;

class FindMax {
    public static void maxFinder(int num1,int num2, int num3){
        int maxNum = Math.max(num1 , Math.max(num2 , num3));
        System.out.println("the maximum of "+num1 + ","+ num2+","+num3 +"is " +maxNum);
    }

    public static void main(String[] args) {
        maxFinder(1,2,5);
        maxFinder(25,35,-25);
        maxFinder(5,6,8);
    }
}
