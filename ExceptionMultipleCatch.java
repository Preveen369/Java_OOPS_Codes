public class ExceptionMultipleCatch {
    public static void main(String[] args) {
        // Exceptions with multiple catch blocks
        int num1 = 2;
        int num2 = 0;
        String name = null;
        int[] arr_nums = new int[8];

        try {
            num2 = 18 / num1;
            System.out.println(arr_nums[0]);
            System.out.println(arr_nums[8]);
            System.out.println(name.length());
        } /*
           * catch (Exception e) { (way-1)
           * if (e instanceof ArithmeticException) {
           * System.out.println("Something went wrong... " + e);
           * } else if (e instanceof ArrayIndexOutOfBoundsException){
           * System.out.println("Index out of bounds... " + e);
           * } else if (e instanceof NullPointerException){
           * System.out.println("Null value specified... " + e);
           * }
           */
        
        catch (ArithmeticException e) { // (way-2)
            System.out.println("Something went wrong... " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds... " + e);
        } catch (NullPointerException e) {
            System.out.println("Null value specified... " + e);
        } catch(Exception e){
            // always Exception (parent) catch block palced at 
            // bottom of other specific exception catch blocks.
        }

    }
}
