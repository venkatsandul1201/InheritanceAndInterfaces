package InheritanceInterface;

public class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class FilledCircle extends Circle {
    @Override
    void draw() {
        System.out.println("Drawing a filled circle");
    }
}

class MultiLevelOverrideExample {
    public static void main(String[] args) {
        FilledCircle filledCircle = new FilledCircle();
        filledCircle.draw();
    }
}
