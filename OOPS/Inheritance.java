import java.util.*;
import bank.Account;

class Shape{
    String color;
    public void area(){
        System.out.println("Display Area")
    }
}

class Tringle extends Shape{
    public void area(int length, int height){
        System.out.println("Area of Tringle is : "+(1/2)*length*height)
    }
}
class Circle extends Tringle{
    public void area(int radius){
        System.out.println("Area of Circle is : "+Math.PI*radius*radius)
    }
}

public class Inheritance{
    public static void main(String[] args){
        // Tringle t1 = new Tringle();
        // t1.color = "red";

        Account a1 = new Account();
        a1.name = "Prabhakar"
    }
}