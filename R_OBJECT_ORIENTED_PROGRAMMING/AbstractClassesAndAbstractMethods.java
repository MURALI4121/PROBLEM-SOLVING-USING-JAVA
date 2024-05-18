package R_OBJECT_ORIENTED_PROGRAMMING;


// Consider an application for a zoo where we have different types of animals
//we want to ensure that every animal can make a sound, but the sound each animal makes it different
//we can use an abstract class to define a common template for all animals


//Abstract class
abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    //Abstract method
    public abstract void makeSound();

    //Concrete method
    public void eat(){
        System.out.println(name + " is eating");
    }

    public String getName(){
        return name;
    }
}
// Subclass Dog
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Woof Woof");
    }
}

//Subclass Cat
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("meow meow");
    }
}

//Subclass Cow
class Cow extends Animal{
    public Cow(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Amba Amba");
    }
}

// Main Class
class Zoo{
    public static void main(String[] args) {
        Animal dog = new Dog("Chintu");
        Animal cat = new Cat("Whiskers");
        Animal cow = new Cow("Chinnu");

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();

        cow.eat();
        cow.makeSound();
    }

}
