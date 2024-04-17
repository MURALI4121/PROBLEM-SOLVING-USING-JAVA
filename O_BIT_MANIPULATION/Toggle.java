package O_BIT_MANIPULATION;

public class Toggle {
    public static void main(String[] args) {
        int n = 36;
        int i = 5;

        int OnMask = 1 << i;

        System.out.println(n ^ OnMask);
    }
}
