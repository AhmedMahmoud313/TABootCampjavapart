package com.bootcampexercies.module7.activity;


public class CustomExceptionActivityTest {

    //1 - Type main method and call validateUser() from it.
    //Call this method with different names to test it

    public static void main(String[] args) {
        String[] users = {"marko", "John", "Mike", "sara"};
        for (int i = 0; i < users.length; i++) {
            validateUser(users[i]);
        }
    }

    public static void validateUser(String name) {
        int flag = 0;
        try {
            //array of names
            String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
            //flag stores 1 if a match is found else it should remain 0

            for (int i = 0; i < validUsers.length; i++) {
                //2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
                if (name == validUsers[i])
                    flag = 1;
            }
            if (flag == 1)
                System.out.println("Welcome to Payroll program");
            else
                throw new CustomExceptionActivity();
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }


    }
}
