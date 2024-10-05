package InheritanceInterface;

public class Vehicle2 {
    abstract void drive();
}

class Bike extends Vehicle2 {
    void drive() {
        System.out.println("Bike is driving");
    }
}

class AbstractInheritanceExample {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.drive();
}
