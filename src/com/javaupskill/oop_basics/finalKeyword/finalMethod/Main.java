package com.javaupskill.oop_basics.finalKeyword.finalMethod;
class Student {
    /*final void greet() {
        System.out.println("Hello!");
    }
*/ //Error, basta may final keyword, hindi na pedeng maulit ang method
    void greet() {
        System.out.println("Hello!");
    }
}
class Carlo extends Student {
    void greet() {
        System.out.println("Hello!");
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
