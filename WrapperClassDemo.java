public class WrapperClassDemo {
    /*
     * WRAPPER CLASSES FOR PRIMITIVE TYPES:
     * byte -Byte
     * int - Integer
     * long -Long
     * char- Character
     * double -Double
     * float -Float
     * boolean -Boolean
     */

    @SuppressWarnings("removal")
    public static void main(String[] args) {
        int value1 = 45;
        Integer val1 = new Integer(value1); // boxing
        System.out.println(val1);

        int value2 = 45;
        Integer val2 = value2; // auto-boxing
        System.out.println(val2);

        Integer val3 = new Integer(45);
        int value3 = val3.intValue(); // un-boxing
        System.out.println(value3);

        Integer val4 = new Integer(45);
        int value4 = val4; // auto un-boxing
        System.out.println(value4);

        //convert string into int type using parseInt
        String str="12";
        int value5=Integer.parseInt(str);
        System.out.println(value5); 

        //Convert number into String 
        String str1=Integer.toString(23); //convert number into string
        System.out.println(str1);
    }
}