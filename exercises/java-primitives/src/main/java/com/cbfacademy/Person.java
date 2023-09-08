package com.cbfacademy;

public class Person {
    int age;

    public static void main(String[] args) {
        Person p = new Person();

        // here we use dot notation to set age
        p.age = 20;

        // here we use dot notation to access age and print
        System.out.println("Age is " + p.age);
    }
}
