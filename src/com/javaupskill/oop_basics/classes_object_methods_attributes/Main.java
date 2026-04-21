package com.javaupskill.oop_basics.classes_object_methods_attributes;

class Student {
    String name;
    int age;
    String course;

    void introduce() {
        System.out.println("Hello I am " + name);
        System.out.println("I am " + age + "yrs old.");
        System.out.println("I am " + course + " student.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Carlo";
        student.age = 19;
        student.course = "BSIT";
        student.introduce();
    }
}
