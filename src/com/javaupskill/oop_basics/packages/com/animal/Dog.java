package com.javaupskill.oop_basics.packages.com.animal;

public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name + " says, Woof!");
    }
}
