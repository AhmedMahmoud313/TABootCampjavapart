package com.bootcampexercies.module5.activity;

public class Circle extends Shape {
    public double radius;
    public String color;
    public double area;
    public double perimeter;
    public static double pi = 3.14;
    public Circle(){
        System.out.println(" circle");
    }
    //getter and setter for radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return (pi*(radius*radius));
    }


    public double calculatePerimeter() {
        return pi*radius;
    }

}
