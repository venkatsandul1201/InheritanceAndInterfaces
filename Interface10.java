package InheritanceInterface;

class Outer {
    interface InnerInterface {
        void display();
    }
}

class InnerClass implements Outer.InnerInterface {
    public void display() {
        System.out.println("Displaying from inner interface");
    }
}

class Interface10 {
    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.display();
    }
}

