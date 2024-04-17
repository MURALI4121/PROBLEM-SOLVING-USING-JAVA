package O_BIT_MANIPULATION;

public class CheckONorOFF {
    public static void main(String[] args) {
        int n = 36;
        int i = 5;

        int cMask = 1<<i;

        if((n & cMask) == 0 ){
            System.out.println("OFF");
        }else{
            System.out.println("ON");
        }
    }
}
