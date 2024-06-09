
abstract class Animal{
    abstract public void walk();
    Animal(){
        System.out.println("You are creating a construtoe by Animal class.");
    }
    public void eat(){
        System.out.println("Animal is eats.");
    }
}

class Horse extends Animal{
        Horse(){
            System.out.println("You are creating a construtoe by Horse class.");
        }
    public void walk(){
        System.out.println("Horse is walking....");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken is walking.....");
    }
}

public class Abstraction{
    public static void main(String[] args){
            Horse horse = new Horse();
            horse.walk();
            horse.eat();

            // Animal animal = new Animal(); // It's a abstract so object is not possible, It's throw the error. 
            // animal.walk();
    }
}