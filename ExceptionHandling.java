public class ExceptionHandling {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        // using try-catch blocks:
        try {
            // it handles the exceptions raised by the
            num2 = 18 / num1; // ** critical statement
            // if exception occurs, throws the "Exception" object
        }
        catch (Exception e) { // recives the "Exception" object & handle it
            System.out.println("Something went Wrong!! " + e);
        }

        // raising of exception halts execution of other statements
        // exception handling, prevents the above challenge
        System.out.println(num2);
        System.out.println("Bye");
    }
}