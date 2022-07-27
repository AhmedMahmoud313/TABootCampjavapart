package com.bootcampexercies.module5.activity;

public class Employee_I extends Person_I {
    //Attributes
    private double salary;
    private String title;

    //Behavior
    //TODO: write default constructor. Print 'I'm an Employee_I Constructor'
    public Employee_I() {
        System.out.println("'I'm an Employee_I Constructor");
    }
    public Employee_I(double salary, String title) {
        this.salary = salary;
        this.title = title;
    }
    public double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
        this.salary = salary;
    }
    public String gettitle(){
        return title;
    }
    public void settitle(String title){
        this.title=title;
    }

    //TODO: write getter for int salary


    //TODO: write setter for int salary


    //TODO: write getter for String title


    //TODO: write setter for String title
}
