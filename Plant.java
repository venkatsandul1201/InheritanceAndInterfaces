package InheritanceInterface;

public class Plant {
    String type = "Plant";
}

class Tree extends Plant {
    void display() {
        System.out.println("Type: " + type);
    }
}

class AccessParentFieldExample {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.display();
    }
}
