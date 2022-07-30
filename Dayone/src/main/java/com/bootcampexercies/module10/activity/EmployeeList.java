package com.bootcampexercies.module10.activity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList  extends Employee{
    public static List<Employee> empList = new ArrayList<Employee>();

    EmployeeList() {
        Employee employee1 = new Employee("Jack", 20, "Manager", "Appolo", 50000);
        Employee employee2 = new Employee("rose", 20, "Accountant", "Ferrari", 20000);
        Employee employee3 = new Employee("Joe", 20, "Coordinator", "Crystal", 25000);
        Employee employee4 = new Employee("Ross", 20, "Engineer", "Microsoft", 30000);
        Employee employee5 = new Employee("Rachel", 20, "Developer", "Google", 40000);

        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);
    }

    public void Print() {
        System.out.println("The Employee whose salary is the highest is :" + empList.get(0).getHighestPaidEmp(empList));
    }

    public static void main(String[] args) {

        EmployeeList employeelist = new EmployeeList();
        employeelist.Print();

    }
}



