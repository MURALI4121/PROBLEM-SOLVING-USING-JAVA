package E_CONTROL_FLOW_STATEMENTS.FOR_LOOP;

class EvenNumPrinter {
    public static void main(String[] args) {

        //  first logic : efficient answer
        for (int i = 2; i < 100; i += 2) {
            System.out.println(i);
        }

        //second logic : less efficient compare to first logic
        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
