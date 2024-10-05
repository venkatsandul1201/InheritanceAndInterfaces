package InheritanceInterface;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

class Interface9 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println("Sum: " + add.calculate(5, 10));
    }
}

