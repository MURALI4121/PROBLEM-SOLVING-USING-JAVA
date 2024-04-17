package O_BIT_MANIPULATION;

public class SwitchOFFithBit {
    public static void main(String[] args) {
        int n = 36;
        int i = 5 ;

        int onMask = ~(1 << i);

        System.out.println(n & onMask);
    }
}
