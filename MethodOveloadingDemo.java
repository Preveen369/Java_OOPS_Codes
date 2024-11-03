
class SimpleCalculator {
    // METHOD OVERLOADING : 
    // same method name, different no. of parameters
    // and different return data types.
    // improves code reusability, accessibility.

    public int mul(int n1, int n2, int n3) {
        return n1 * n2 * n3;
    }

    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public double mul(int n1, double n2) {
        return n1 * n2;
    }
}

public class MethodOveloadingDemo {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        //double num2 = 5.0;
        //int num3 = 4;

        SimpleCalculator calc = new SimpleCalculator();

        //int product = calc.mul(num1, num2, num3);
        int product = calc.mul(num1, num2);
        //double product = calc.mul(num1, num2);

        System.out.println("Result: " + product);

    }
}
