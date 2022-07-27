package com.bootcampexercies.module5.activity;

public class AbstractActivity {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("White");
        System.out.println(rectangle.getColor());
        rectangle.setlength(5);
        rectangle.setwidth(5);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());


        Circle circle = new Circle();
        circle.setColor("Green");
        System.out.println(circle.getColor());

        circle.setRadius(5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());


    }


}
