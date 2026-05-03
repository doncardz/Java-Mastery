package com.javaupskill.fundametals.dataTypes.nonPrimitive.object;
//Almost the same lng ng class ang itsura.
class Student {
    String name;
    int age;

    void display() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();// Eto ang object

        student.name = "John";
        student.age = 16;

        student.display();
    }
}
