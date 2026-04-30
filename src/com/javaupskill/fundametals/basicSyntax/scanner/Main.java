package com.javaupskill.fundametals.basicSyntax.scanner;
 //user inputs

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String name1, name2;

        System.out.println("Enter your first name: ");
        name1 = scn.nextLine();

        System.out.println("Enter your last name: ");
        name2 = scn.nextLine();

        System.out.println(name1 +" " + name2);

        scn.close();
    }
}
