package com.javaupskill.oop_basics.accessSpecifier.Protected;

class Bird extends Animal {
    void speak() {
        sound();
    }
}
public class Main{
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.speak();
    }
}