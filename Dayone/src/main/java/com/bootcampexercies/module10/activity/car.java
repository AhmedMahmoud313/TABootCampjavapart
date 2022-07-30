package com.bootcampexercies.module10.activity;

public class car implements Vehicle{
    @Override
    public void vehiclestart() {
        System.out.println("Use gear shift lever  ");

    }

    @Override
    public void vehiclestop() {
        System.out.println("Use break  ");

    }
}
