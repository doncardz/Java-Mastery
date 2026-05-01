package com.javaupskill.fundametals.basicSyntax.bufferReader;

//In this code, I will use parse so I'll use int and double

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("How much is your money?: ");
        double money = Double.parseDouble(br.readLine());

        System.out.println("Your age is " + age);
        System.out.println("Your money is " + money);
    }
}
