package R_OBJECT_ORIENTED_PROGRAMMING;

public class Driver {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        System.out.println(myCar.getCurrentFuel());
    }
}
