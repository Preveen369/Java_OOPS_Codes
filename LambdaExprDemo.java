// JAVA FUNCTIONAL PROGRAMMING (PART-2)

//specify it is functional interface
@FunctionalInterface 
interface Firsts {
    public void display(int value, int id); // -> functional method
}

@FunctionalInterface
interface Seconds {
    public void show(int num);
}

@FunctionalInterface
interface Operation {
    int add(int a, int b);  // with return data type
}

class LambdaExprDemo {
    public static void main(String[] args) {

        // LAMBDA - EXPRESSION FORMAT:
        /* data_type var_name = ([parmamter]) -> { [set of statements;] };
         * data_type var_name = ([parmamter]) -> [return expression]; */

        // RULE OF THUMB FOR LAMBDA-EXPRESSION: IT ONLY WORKS WITH FUNCTIONAL INTERFACE

        // Third-way: By using lambda-expressions (with/without params/{}/line)
        // No need to use classes/object creation/method signatures:
        Firsts obj1 = (int value, int id) -> 
        System.out.println("In display(): \"Hello!!\"; value: " + value + "; id: " + id);
        obj1.display(369, 50);

        Seconds obj2 = num -> 
        System.out.println("In show(): \"Welcome!!\"; num: " + num);
        obj2.show(36);

        // Lambda expression with return type values
        Operation obj = (a, b) -> a+b;
        int result = obj.add(5,5);
        System.out.println("result: " + result);

 
        // Key Advantages of this exprression:
        // They allow you to define the behaviour of a functional interface in single
        // line of code.
        // They are a key component of functional programming in Java.
    }
}
