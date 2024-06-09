// package com.apnacollege;
class MyClass{
    static int s = 45;
    public static void maxFunction(int x, int y){
     static int s1 = 45;
        int max;
        if(x>y)
            max = x;
        else
            max = y;
        System.out.println("hey");
    }
    // public int maxFunction(int x, int y){
    // static int s1 = 45;
    //     int max;
    //     if(x>y)
    //         max = x;
    //     else
    //         max = y;
    //     return max;
    // }
    // public int maxFunction(int b){
    //     int a,max;
    //     a=10;
    //     if(a>b)
    //         max=a;
    //     else
    //         max=b;
    //     return max;
    // }
}
public class M_Overriding {
    public static void main(String [] args){
        // MyClass my = new MyClass();
        MyClass.maxFunction(13,12);
        // int a1 = my.maxFunction(13);
        // int a2 = my.maxFunction(18,15);
        // System.out.println("The value of a1 = "+a1);
        // System.out.println("The value of a2 = "+a2);
        // int a2 = maxFunction(13,15);
        // System.out.println("The value of a2 = "+a2);
        

    }
}
