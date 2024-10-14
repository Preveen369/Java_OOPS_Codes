/* Abstraction: It is a process of hiding the implementation details 
and showing only functionality to the user.

Abstract method, Abstract Class:
Instead of defining the method, we can declare the method.
We will not be able to create an object of it.
You need to add an abstract keyword to only declare a method.

Abstract class:
Abstract methods can only be defined in an abstract class.
We need to add an abstract keyword before a class to make it an abstract class.
Objects of an abstract class can not be created.
If you are extending an abstract class, then it is compulsory to define all abstract methods.

Concrete class: A class other than an abstract class is known as a concrete class.
An object of a concrete class can be created. */

abstract class Smart_phone {
    // abstract method creation (only declaration)
    public abstract void call();

    // non-abstract (concrete) method creation (implementation)
    public void message() {
        System.out.println("Messaging the phone...");
    }

    public void browse() {
        System.out.println("Browsing the phone...");
    }
}

// Abstract class can be inherited by another Abstract subclass
abstract class Redmi9A extends Smart_phone{
    public abstract void call();
}

// Every concrete-class's must implement abstract methods
// Abstract class can be inherited by Subclass
class UpgradedRedmi9A extends Redmi9A{
    public void call(){
        System.out.println("Calling the phone...");
    };
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // No object can be created for Abstract class, but
        // object could be created for concrete class
        Smart_phone mobile = new UpgradedRedmi9A();
        mobile.call();
        mobile.message();
        mobile.browse();
    }
}
