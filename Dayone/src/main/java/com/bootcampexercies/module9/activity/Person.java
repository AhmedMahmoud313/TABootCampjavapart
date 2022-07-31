package com.bootcampexercies.module9.activity;

public class Person {
    private int weight;
    private float height;

    Person() {

    }

    Person(int weight, float height) {
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight

    public String getBodyMassIndex() {
        if(weight > 300) {
            return "Maximum Weight Limit Exceeded";
        }
        if (height > 7.0) {
            return "Maximum Height Limit Exceeded";
        }
        if(weight <= 0) {
            return "Minimum Weight Limit Exceeded";
        }
        if (height <= 0.0) {
            return "Minimum Height Limit Exceeded";
        }

        float BMI = weight / (height * height);
        return Float.toString(BMI);

    }

}
