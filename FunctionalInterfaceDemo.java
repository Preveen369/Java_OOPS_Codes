// JAVA FUNCTIONAL PROGRAMMING (PART-1)

//specify it is functional interface
@FunctionalInterface // we use this annotation to specify it is functional interface
interface First {
    public void display();  // -> functional method
    // maybe implemented through class/inner-class/lambda-expression
    // public void show(); -> we can't write two methods in this interface
}

// First-way: implement through a class
/*class Second implements First{
    @Override
    public void display() {
        System.out.println("In display() : \"Hello\"");        
    }

}*/

class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        /* First obj = new Second(); */

        // Second-way: implement through anonymous inner-class
        First obj = new First(){
            public void display() {
                System.out.println("In display() : \"Hello\"");        
            }
        };
        obj.display();

        // Third-way: By using lambda-expressions

    }
}
