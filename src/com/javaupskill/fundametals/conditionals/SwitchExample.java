package com.javaupskill.fundametals.conditionals;

public class SwitchExample {
    public static void main(String[] args) {

        int sem = 2;

        switch (sem) {
            case 1:
                System.out.println("Prelims");
                break;
            case 2:
                System.out.println("Midterms");
                break;
            case 3:
                System.out.println("Pre-Finals");
                break;
            case 4:
                System.out.println("Finals");
                break;
            default:
                System.out.println("Not a Semester Period!");
        }
    }
}
