package com.bootcampexercies.module5.activity;

public class InheritanceActivity {

    public static void main(String[] args) {


        Person_I p = new Person_I();
        p.setName("Sarah Johnson");
        p.setAge(21);



        System.out.println("-----------------------------");

        Employee_I employee=new Employee_I();
       employee.setsalary(70000.00);
       employee.settitle("Developer");
       employee.setAge(32);
       employee.setName("cun");

        System.out.println("-----------------------------");
        System.out.println("Employee Salary:"+employee.getsalary());
        System.out.println("Employee Title:"+employee.gettitle());
        System.out.println("Employee Age:"+employee.getAge());
        System.out.println("Employee Name:"+employee.getName());
        // Print Info using Employee object



        // Print Info using Person object
        System.out.println("-----------------------------");
        System.out.println("Person's Name is    : " + p.getName());
        System.out.println("Person's Age is     : " + p.getAge());


    }
}
