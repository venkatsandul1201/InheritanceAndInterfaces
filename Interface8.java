package InheritanceInterface;

interface Greeting {
    void sayHello(String name);
}

class EnglishGreeting implements Greeting {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

class Interface8 {
    public static void main(String[] args) {
        Greeting greeting = new EnglishGreeting();
        greeting.sayHello("John");
    }
}

