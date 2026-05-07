package com.javaupskill.fundametals.conditionals;

public class Ladder {
    public static void main(String[] args) {
        int age = 9;

        if(age >= 60) {
            System.out.println("You are a senior citizen");
        } else if(age >= 18) {
            System.out.println("You are an adult");
        } else if(age <= 10) {
            System.out.println("You are a kid");
        } else if(age <= 17) {
            System.out.println("You are a minor");
        } else {
            System.out.println("You are an alien");
        }

    }
}
