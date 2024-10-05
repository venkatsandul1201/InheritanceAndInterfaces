package InheritanceInterface;

public class Vehicle3 {
    protected String type = "Vehicle";
}

class Car extends Vehicle {
    void display() {
        System.out.println("Type: " + type);
    }
}

class ProtectedInheritanceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
    
}
