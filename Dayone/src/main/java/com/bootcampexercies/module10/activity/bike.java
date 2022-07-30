package com.bootcampexercies.module10.activity;

public class bike implements Vehicle {
    @Override
    public void vehiclestart() {
        System.out.println("Move the pedal forward");
    }

    @Override
    public void vehiclestop() {
        System.out.println("Leave the pedal and use the brakes");

    }
}
