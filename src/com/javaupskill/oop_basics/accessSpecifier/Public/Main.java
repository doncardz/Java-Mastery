package com.javaupskill.oop_basics.accessSpecifier.Public;
class Car {
    String name = "Toyota";
}
public class Main {
    public static void main(String[] args) {
        Car kotse = new Car();
        System.out.println(kotse.name);
    }
}
