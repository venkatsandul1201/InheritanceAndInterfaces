package InheritanceInterface;

public class Writer {
    void write() {
        System.out.println("Writing content");
    }
}

class Poet extends Writer {
    @Override
    void write() {
        System.out.println("Poet writes a poem");
    }
}

class OverrideMethodExample {
    public static void main(String[] args) {
        Poet poet = new Poet();
        poet.write();}
}
