
class Calculator {
    // create a property
    String operation;
    
    // create a method, returns value
    public int multiply(int n1, int n2){
        int r = n1 * n2;
        return r;
    }
}

public class Demo{
    public static void main(String[] args) {
        int num1=30;
        int num2=40;

        // create an object (instance) of a class
        // telling JVM create a "new" object of (design?)
        Calculator calc = new Calculator();
        // calc -> reference of an object
        // Calculator calc1 = new Calculator();
        

        // access a method through object ref (passing values)
        int product = calc.multiply(num1,num2);
        System.out.println("Result: " + product);

        // access a property through object ref (initializing values)
        calc.operation="Multiplication";
        System.out.println(calc.operation);
        // System.out.println(calc1.operation);

        // NOTE FOR STACK AND HEAP MEMORIES:
        // * When both objects are created in heap memory, changing
        // value of one object doesn't reflect the other object.

        // * Each method maintains its own stackframe, where:
        // the variables, values, references, addresses are stored.

        //int product = num1 * num2;
        //System.out.println(product);

    }
}