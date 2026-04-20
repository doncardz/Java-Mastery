package BasicOOP;

class Vehicle {
    String brand;
    int speed;

    void specs() {
        System.out.println("The car brand is " + brand + " and Its top speed is " + speed + "km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.brand = "Nissan GT-R R35";
        car.speed = 315;
        car.specs();
    }
}
