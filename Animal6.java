package InheritanceInterface;

public class Animal6 {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    Dog() {
        speak();
        System.out.println("Dog is created");
    }
}

class ConstructorMethodCall

