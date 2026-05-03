package com.javaupskill.fundametals.basicSyntax.bufferReader.StudentReceiptGen_usingBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StudentReciept {
    public String name;
    public int age;
     void display() {
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
     }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StudentReciept sr = new StudentReciept();

        System.out.println("Name: ");
        sr.name = br.readLine();

        System.out.println("Age: ");
        sr.age = Integer.parseInt(br.readLine());

        System.out.println(" ");
        System.out.println("=====================");

        sr.display();
    }
}
