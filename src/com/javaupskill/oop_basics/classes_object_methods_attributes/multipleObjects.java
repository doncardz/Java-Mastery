package com.javaupskill.oop_basics.classes_object_methods_attributes;

class Students{
    String name;
    int age;
    String course;

    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course " + course);
        System.out.println("===================");
    }
}

public class multipleObjects {
    public static void main(String[] args){

        Students student = new Students();
        student.name = "Carlo";
        student.age = 19;
        student.course = "BSIT";
        student.introduce();

        Students student1 = new Students();
        student1.name = "Locar";
        student1.age = 20;
        student1.course = "BSCS";
        student1.introduce();

        Students student2 = new Students();
        student2.name = "Don";
        student2.age = 21;
        student2.course = "BSCpE";
        student2.introduce();



    }
}
