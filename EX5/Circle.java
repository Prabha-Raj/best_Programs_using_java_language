package com.prabha.shape;

public class Circle extends Shape{
    Rectangle(int dim1){
        super(dim1, -1);
    }
    public double area(){
        return Math.PI*this.dim1*this.dim1;
    }
}