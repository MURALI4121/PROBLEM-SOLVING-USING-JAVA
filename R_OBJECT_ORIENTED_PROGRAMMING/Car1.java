package R_OBJECT_ORIENTED_PROGRAMMING;

public class Car1 {

    //Fields or instance variables
    String color;
    int year;
    String Name;
    String model;

    //Constructor 1
    Car1(String color,int year,String Name,String model){
        this.color = color;
        this.year = year;
        this.Name = Name;
        this.model = model;
    }
    //Constructor 2
    Car1(String color, int year){
        this.color = color;
        this.year = year;
    }

    //Methods to display the details of the car
    void displayDetails(){
        System.out.println("Color : " + this.color);
        System.out.println("Year :"+ year);
        System.out.println("name :" + Name);
        System.out.println("Model :" + model);

    }
    void displayDetails1(){
        System.out.println("Color : " +color);
        System.out.println("Year :"+ year);
    }



    public static void main(String[] args) {
        Car1 myCar  = new Car1("Red",2005,"BMW","Series");// this is to create an object
        Car1 YourCar = new Car1("Blue", 2005);
        //Display car details
        myCar.displayDetails();
        YourCar.displayDetails1();

    }


}
