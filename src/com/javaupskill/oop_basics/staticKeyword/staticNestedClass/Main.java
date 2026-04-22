package com.javaupskill.oop_basics.staticKeyword.staticNestedClass;
class Laptop {
    String brand;

    static class Gpu {
        String unit = "NVIDIA RTX 5090";

        void flex() {
            System.out.println("GPU: " + unit);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Laptop.Gpu lp = new Laptop.Gpu();
        lp.flex();
    }
}
