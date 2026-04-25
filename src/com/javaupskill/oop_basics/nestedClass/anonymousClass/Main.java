package com.javaupskill.oop_basics.nestedClass.anonymousClass;

interface Greet {
    void greet();
}
public class Main {
    public static void main(String[] args) {
        Greet grt = new Greet() {
            public void greet() {
                System.out.println("Hello");
            }
        };
        grt.greet();
    }
}
