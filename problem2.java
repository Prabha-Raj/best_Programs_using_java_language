package folder.folderl1.folderl2;

class Calculator{
    public void calcutlate(int a, int b){
        System.out.println("your result is  "+ a+b);
    }
}

class ScCalculator{
    public void calcutlate(int a, int b){
        System.out.println("your result is  "+ Math.sin(a+b));
    }
}
class HyCalculator{
    public void calcutlate(int a, int b){
        System.out.println("your result is  "+ a+b);
        System.out.println("your result is  "+ Math.sin(a+b));
    }
}

public class problem2{
    protected int proInt = 4;
    int defInt = 45;
    public static void main(String[] args){
        System.out.println("I'm an main method");
    }
}