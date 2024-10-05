package InheritanceInterface;

public class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.bark();
    }
    
}
