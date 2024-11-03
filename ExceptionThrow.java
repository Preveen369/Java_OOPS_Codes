public class ExceptionThrow {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 0;

        try {
            num2 = 18 / num1;
    
            // throwing (raising) an error explicitly:
            if (num2 == 0){
                // to create an exception object alongwith passing a message
                throw new ArithmeticException("I don't want to print 0!!");
            }
        }
        
        catch (ArithmeticException e) { 
            num2 = 18 / 1;
            // handling the exceptions
            System.out.println("That's the default value.. " + e);

        } catch(Exception e){
            System.out.println("Something went wrong... " + e);
        }

        System.out.println(num2);
    }
}
