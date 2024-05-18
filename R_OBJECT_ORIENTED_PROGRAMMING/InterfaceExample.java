package R_OBJECT_ORIENTED_PROGRAMMING;

//Consider a vehicle system where we have different types of vehicles such as cars,bikes and trucks
//We want to ensure that Every vehicle can start,stop and honk.
//We can use an interface to define these common behaviours


import java.sql.SQLOutput;

//Interface
interface Vehicle {

    //Abstract methods
    void start();

    void stop();

    void honk();

    //Default method
    default void displayDetails() {
        System.out.println("This is a vehicle");
    }
}


//Implementing Class Car

class Car2 implements Vehicle {
    private String model;
    private String brand;

    public Car2(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("Car is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void honk() {
        System.out.println("Car is Honking");
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model : " + model + ", Brand : " + brand);
    }
}

//Implementing class Bike

class Bike implements Vehicle {

    private String model;
    private String brand;


    public Bike(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("Bike is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is Stopping");
    }

    @Override
    public void honk() {
        System.out.println("Bike is Honking");
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Model : " + model + " , Brand: " + brand);
    }
}

//Implements a truck

class Truck implements Vehicle {
    private String model;
    private String brand;

    public Truck(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is Stopping");
    }

    @Override
    public void honk() {
        System.out.println("Truck is Honking");
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Model : " + model + " , Brand: " + brand);
    }

}

// Main Class

class VehicleSystem {
    public static void main(String[] args) {
        Vehicle Car2 = new Car2("MayBach", "Benz");
        Vehicle bike = new Bike("Ninja", "kawasaki");
        Vehicle truck = new Truck("Terminator", "Megatron");

        //Executing Car class
        Car2.start();
        Car2.stop();
        Car2.honk();
        Car2.displayDetails();
        System.out.println();

        //Executing Bike class
        bike.start();
        bike.stop();
        bike.honk();
        bike.displayDetails();
        System.out.println();

        //Executing Bike class
        truck.start();
        truck.stop();
        truck.honk();
        truck.displayDetails();
        System.out.println();

    }
}