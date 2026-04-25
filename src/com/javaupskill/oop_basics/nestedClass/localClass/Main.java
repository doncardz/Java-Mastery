package com.javaupskill.oop_basics.nestedClass.localClass;

class Insect {
    String type;

    Insect(String type) {
        this.type = type;
    }

    void skill() {
        int feet = 8;

        class Work {
            void display() {
                System.out.println("Insect: " + type);
                System.out.println("Feet: " + feet);
            }
        }

        Work work = new Work();
        work.display();
    }
}
public class Main {
    public static void main(String[] args) {
        Insect ins = new Insect("Spider");
        ins.skill();
    }
}
