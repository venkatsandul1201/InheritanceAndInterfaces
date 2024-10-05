package InheritanceInterface;

public class Animal4 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Lion extends Animal {
    void eat() {
        super.eat();
        System.out.println("Lion eats meat");
    }
}

class SuperMethodExample {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
    }
}
