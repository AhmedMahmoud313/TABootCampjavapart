package com.bootcampexercies.module10.activity;

public class Students extends Person  {
    public String school_name;

    public  Students() {
        this.school_name = school_name;
    }

    public String getSchool_name(String royal_school) {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    @Override
    public String message() {
        return ("My Univeristy is "+getSchool_name("Royal School"));
    }
}
