package com.javaupskill.fundametals.conditionals;

public class Nested {
    public static void main(String[] args) {
        int age = 17;
        boolean isAdult = false;

        if(age >= 18) {
            System.out.println("You are an adult");
            if(isAdult == true) {
                System.out.println("You can now use Facebook");
            } else {
                System.out.println("Please try again later.");
            }
        } else {
            System.out.println("You are still a minor.");
        }
    }
}

