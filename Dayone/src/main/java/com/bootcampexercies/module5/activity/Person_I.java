package com.bootcampexercies.module5.activity;

public class Person_I {


    private String name;
    private int age;

    public String surname;

    public Person_I() {

        System.out.println("I'm Person_I constructor");
    }

    public Person_I(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    //TODO: Write parameterized constructor with variables name and age



    //TODO: write getter for String name


    //TODO: write setter for String name


    //TODO: write getter for int age


    //TODO: write setter for int age

}
