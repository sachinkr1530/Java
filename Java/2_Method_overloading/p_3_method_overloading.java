
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }
}

public class p_3_method_overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the add method with two integers
        System.out.println("Sum of two integers: " + calc.add(5, 10));

        // Calling the add method with three integers
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));

        // Calling the add method with two double values
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));
    }
}
