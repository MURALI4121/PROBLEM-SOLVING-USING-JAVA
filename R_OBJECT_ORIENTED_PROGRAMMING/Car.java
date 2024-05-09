package R_OBJECT_ORIENTED_PROGRAMMING;

public class Car {

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;


    public void drive() {

        if (currentFuelInLitres <= 0) {
            System.out.println("Car  is out of Fuel");
        } else if (currentFuelInLitres < 5) {
            System.out.println("Car is reserved mode, please refuel");
            currentFuelInLitres--;
        } else {
            System.out.println(" Car is Driving");
            currentFuelInLitres--;
        }
    }

        public void addFuel ( float fuel){
            currentFuelInLitres += fuel;
        }

        public float getCurrentFuel () {
            return currentFuelInLitres;
        }

        public static void main (String[]args){

        }

    }
