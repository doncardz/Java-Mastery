package com.javaupskill.oop_basics.nestedClass.staticNested;

class Student {
    static String name = "Paulo";

    static class Course {
        String course;

        Course(String course) {
            this.course = course;
        }

        void Greet() {
            System.out.println("Hello my name is " + name + ", my course is " + course);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Student.Course stu = new Student.Course("BSIT");
        stu.Greet();
    }
}