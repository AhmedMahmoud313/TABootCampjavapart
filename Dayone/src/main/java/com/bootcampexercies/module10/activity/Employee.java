package com.bootcampexercies.module10.activity;

import java.util.List;

public class Employee extends Person {
    public String jobTitle;
    public String company;
    public float salary;

    public Employee(String name, int age, String jobTitle, String company, float salary) {
        super(name,age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public Employee() {
        super();

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public String setCompany(String company) {
        this.company = company;
        return company;
    }

    public float getSalary() {
        return salary;
    }

    public float setSalary(float salary) {
        this.salary = salary;
        return salary;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String message() {
        return ("My name is " + getName() + "I Am " + getAge() + "years old" + "i am work as" + getJobTitle() + "in"
                + getCompany() + "My salary is " + getSalary());
    }

    String getHighestPaidEmp(List<Employee> empList) {
        String name = "";
        float max = 0;
        for (Employee employee : empList) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getName();

            }
        }

        return name;
    }
}
