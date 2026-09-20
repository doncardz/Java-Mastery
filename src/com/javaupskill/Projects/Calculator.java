package com.javaupskill.Projects;

import java.util.Scanner;

class Calcu {
    int add;
    double divide;

    public void calculate() {
        System.out.println("Error!");
    }

    public void calculate(int num1, int num2) {
        add = num1 + num2;
    }

    public void calculate(double num3, double num4) {
        divide = num3 / num4;
    }

    public void showSum() {
        System.out.println(add);
    }

    public void showQuotient() {
        System.out.println(divide);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Calcu calc = new Calcu();

        char choices = ' ';

        while(choices != 'C' && choices != 'c') {

            System.out.println("==========");
            System.out.println("  Calcu   ");
            System.out.println("==========");

            System.out.println("A. Add");
            System.out.println("B. Divide");
            System.out.println("C. Quit");

            System.out.print("Select operation(A/B/C): ");
            choices = scn.next().charAt(0);

            if (choices == 'A' || choices == 'a') {
                System.out.print("FirstNumber: ");
                int num1 = scn.nextInt();

                System.out.print("SecondNumber: ");
                int num2 = scn.nextInt();

                calc.calculate(num1, num2);
                calc.showSum();
            }

            else if (choices == 'B' || choices == 'b') {
                System.out.print("FirstNumber: ");
                double num3 = scn.nextDouble();

                System.out.print("SecondNumber: ");
                double num4 = scn.nextDouble();

                calc.calculate(num3, num4);
                calc.showQuotient();
            }

            else if (choices == 'C' || choices == 'c') {
                break;
            }

            else {
                calc.calculate();
            }
        }
    }
}
