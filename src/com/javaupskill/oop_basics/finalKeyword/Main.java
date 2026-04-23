package com.javaupskill.oop_basics.finalKeyword;

public class Main{
    public static void main(String[] args){

       final int age = 20; // Error, bawal na paltan ang laman ng variable kung eto ay naka final na
       age = 13;

        System.out.println(age);

    }
}