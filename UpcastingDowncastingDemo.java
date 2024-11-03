// Up-casting and Down-casting of objects in java:

/* Conditions: For that two class should have some parents child relationship */

class SuperClass {
    public void display1() {
        System.out.println("In Superclass's display");
    }
}

class SubClass extends SuperClass {
    public void display2() {
        System.out.println("In Subclass's display");
    }
}

public class UpcastingDowncastingDemo {
    public static void main(String[] args) {
        // Child type -> Parent type (UPCASTING)
        SuperClass obj = (SuperClass) new SubClass();      
        // obj.display2();  -> creates error, "parent type referred child object" 
        // can't access it's own (child) class methods [PARENT OBJECT]

        // Parent type -> Child type (DOWNCASTING)
        SubClass obj1 = (SubClass) obj;
        obj1.display2();    // [CHILD OBJECT]
        
    }
}
