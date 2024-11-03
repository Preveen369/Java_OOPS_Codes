// METHOD OVERRIDING - 1:
// Different implementation (definition) for methods in the
// subclass and superclass defined with same name, return type.

// subclass's method gets checked first before superclass part
class A{
    public void display(){
        System.out.println("In the A's display...");
    }

    public void config(){
        System.out.println("In the A's config...");
    }
}

class B extends A{
    public void display(){
        System.out.println("In the B's display...");
    }
}

class MethodOverridingDemo1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.config();
    }
}
