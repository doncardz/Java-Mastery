package com.javaupskill.fundametals.conditionals.simpleATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int balance = 5000;
        int choice;
        int totalDp;
        int totalWd;

        System.out.println("Welcome to the ATM!");
        System.out.println("Select Transaction: ");

        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");

        System.out.print("Enter choice: ");
        choice = scn.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Your balance is: " + balance);
                break;
            case 2:
                System.out.print("Enter a number to deposit: ");
                int dp = scn.nextInt();
                totalDp = dp + balance;


                if(dp <= 0) {
                    System.out.println("Error Please try again!");
                } else {
                    System.out.println("Your deposited " + dp + " pesos");
                    System.out.println("Total: " + totalDp);
                }
                break;
            case 3:
                System.out.print("Enter a number to withdraw: ");
                int wd = scn.nextInt();
                totalWd = balance - wd;

                if(wd > balance) {
                    System.out.println("Insufficient Balance");
                } else {
                    System.out.println("You Withdrawed " + wd + " pesos");
                    System.out.println("Total: " + totalWd);
                }
                break;
            case 4:
                System.out.println("Thank you for choosing our ATM!");
                break;
            default:
                System.out.println("Error Please try again!");
        }
    }
}
