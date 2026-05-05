package com.javaupskill.fundametals.typeCasting;

public class NarrowCast {
    public static void main(String[] args) {
        double myDouble = 111.11;
        int myInt = (int) myDouble;

        System.out.println(myInt);
    }
}

/*
    byte
     v
    short
     v
    int
     v
    long
     v
    float
     v
    double
 */