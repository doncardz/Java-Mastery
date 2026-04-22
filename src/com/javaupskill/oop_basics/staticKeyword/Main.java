package com.javaupskill.oop_basics.staticKeyword;

class Student {
    String name;
    static String school = "STI";
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "Carlo";
        student2.name = "Locar";
        System.out.println(student1.name + "-" + Student.school);
        System.out.println("=====================================");
        System.out.println(student2.name + "_" + Student.school);
    }
}
