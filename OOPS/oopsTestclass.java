class Pen{
    String color;
    String type; // ballpoint; gel
    public void write(){
        System.out.println("Writing something.");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    // Polymorphism for one function do defrent-2 work
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // 
    public void printInfo(String name){
        System.out.println(name);
        System.out.println(this.age);
    }
    public void printInfo(int age){
        System.out.println(this.name);
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
    // construtor.
    // Student(String name, int age){
        // this.name = name;
    //     this.age = age;
    // }
    // Student(){} // requred for st2.
    // Student(Student st2){
        // this.name = st2.name;
        // this.age = st2.age;
    // }
}

public class oopsTestclass{
    public static void main(String[] args){
        /*
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "balpen";

        pen1.write();
        pen1.printColor();
        pen1.printType();

        pen2.write();
        pen2.printColor();
        pen2.printType();
        */

    //    Student st1 = new Student("Prabhakar",21);
       Student st1 = new Student();
       st1.name = "Ansh";
       st1.age = 22;
    //    st1.printInfo();

    //    Student st2 = new Student(st1);
    //    st2.printInfo();

        // st1.printInfo();
        // st1.printInfo("Shailandra");
        // st1.printInfo(25);
        st1.printInfo("Anjuli", 23);
    }
}