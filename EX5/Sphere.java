package com.prabha.shape;

public class Sphere extends Shape{
    Rectangle(int dim1,int dim2){
        super(dim1, -1);
    }
    public double area(){
        return 4*Math.PI*this.dim1*this.dim1;
    }
}