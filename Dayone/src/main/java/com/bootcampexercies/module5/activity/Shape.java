package com.bootcampexercies.module5.activity;

public abstract class Shape {
    public String color;
    public double area;
    public double perimeter;

    public Shape() {
    }


    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }


    public abstract double calculateArea();
    public abstract double calculatePerimeter();


    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }


}
