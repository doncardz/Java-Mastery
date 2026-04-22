package com.javaupskill.oop_basics.staticKeyword.staticMethod;

class Calcu{
    static int add(int a, int b) {
        return a + b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
}
public class Calculator {
    public static void main(String[] args) {
        System.out.println(Calcu.add(5,5));
        System.out.println(Calcu.multiply(2,10));
    }
}
