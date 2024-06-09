package com.prabha.shape;

public class Square extends Shape{
    Rectangle(int dim1){
        super(dim1,-1);
    }
    public int area(){
        return this.dim1*this.dim1;
    }
}