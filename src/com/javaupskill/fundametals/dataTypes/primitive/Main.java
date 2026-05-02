package com.javaupskill.fundametals.dataTypes.primitive;
//I will declare the 8 primitive types in java
public class Main {
    public static void main(String[] args) {
        byte b = 100; // 8-bit signed integer, range: -128 to 127. Useful for saving memory in large arrays.
        short s = 20000; // 16-bit signed integer, range: -32,768 to 32,767.
        int i = 100000; //32-bit signed integer, range: -2³¹ to 2³¹-1. Default for integer values.
        long l = 10000000000000L;   //64-bit signed integer, range: -2⁶³ to 2⁶³-1. Use when a wider range than int is needed.
        float f = 3.14f;    //32-bit IEEE 754 floating point. Suitable for 6–7 decimal digits precision.
        double d = 2.1256428735;    //64-bit IEEE 754 floating point. Default for decimal values, ~15–16 digits precision.
        boolean isOnline = true;    // Holds only true or false.
        char c = 'S';   //16-bit Unicode character, range: '\u0000' to '\uffff'.

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(isOnline);
        System.out.println(c);

        /*
        Note: long requires to have "L" at the end.
        Note: float also requires to have "f at the end.
         */
    }
}

