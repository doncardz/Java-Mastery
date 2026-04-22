package com.javaupskill.oop_basics.staticKeyword.staticMethod;

class Teacher{
    static void greet() {
        System.out.println("Good Morning Everyone!");
    }
}

public class Main {
    public static void main(String[] args){
        Teacher.greet();
    }
}
