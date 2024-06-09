
interface Animal{
    int eyes = 2;
    void walk();
}
interface Herbivore{}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Horse is walking by interface Animal and Herbivore");
    }
 }

class Student{
    String name;
    static String school;

    public static void changeSchool(){
        school = "newSchool";
    }

}
 
 public class Interface{
    public static void main(String[] args){
        // Horse horse = ne Horse();
        // horse.walk();

        Student.school = "GPB";
        Student st1 = new Student();
        st1.name = "sona";
        System.out.println(st1.name);
        System.out.println(st1.school);
        st1.changeSchool();

    }
 }