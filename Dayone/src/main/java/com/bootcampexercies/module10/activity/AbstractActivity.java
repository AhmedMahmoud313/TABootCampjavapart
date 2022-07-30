package com.bootcampexercies.module10.activity;

public class AbstractActivity {
    public static void main(String[] args) {
        Employee e1 = new Employee();


        e1.setName(":adam");
        e1.setJobTitle("Devoloper");
        e1.setCompany(":netflex");
        e1.setSalary(2000);
        e1.setAge(25);
        System.out.println(e1.message());
        Students S1=new Students();
        S1.setSchool_name(":Royal Univeristy ");
       System.out.println(S1.message());


    }
}
