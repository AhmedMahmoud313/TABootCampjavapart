package com.bootcampexercies.module5.activity;

public class Rectangle  extends Shape {
    public double length;
    public double width;
    public double perimeter;


    public Rectangle(){
        System.out.println(" rectangle");
    }


    public double calculateArea() {
        return (length*width);
    }

    public double getlength() {
        return length;
    }
    public void setlength(double sideA) {
        this.length = sideA;
    }
    public double getwidth() {
        return width;
    }
    public void setwidth(double width) {
        this.width = width;
    }
    public double calculatePerimeter() {
        return (length + width)*2;
    }

}
