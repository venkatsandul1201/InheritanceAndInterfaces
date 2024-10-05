package InheritanceInterface;

public class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car charges");
    }
}

class MultilevelInheritanceExample {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.move();
        tesla.drive();
        tesla.charge();
    }
}
