package com.javaupskill.oop_basics.nestedClass.innerClass;

class Computer{
    String cpu;

    Computer(String cpu) {
        this.cpu = cpu;
    }

    class CPU {
        int hertz;

        CPU(int hertz) {
            this.hertz = hertz;
        }

        void specs() {
            System.out.println("The cpu is " + cpu + ", It has " + hertz + "ghz");
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Ryzen");
        Computer.CPU ghz = comp.new CPU(4);
        ghz.specs();
    }
}
