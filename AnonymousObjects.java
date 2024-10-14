
class A {

    public A() {
        System.out.println("Object Created...");
    }

    public void show() {
        System.out.println("In A show() method...");
    }

}

public class AnonymousObjects {
    public static void main(String[] args) {
        // int num; // VARIABLE DECLARATION
        // num = 35; // VARIABLE ASSIGNMENT

        // for creating NORMAL OBJECTS:
        // A obj; // OBJECT REFERENCE CREATION
        // obj = new A(); // OBJECT CREATED AND ASSIGNED TO REFERENCE
        // obj.show();

        // ANONYMOUS OBJECTS: can't reuse them, easily access the methods
        // they don't have object reference names [eg: new A();]
        new A().show();

    }
}
