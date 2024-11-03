/* INTERFACES IN JAVA:
 * If your class has only abstract methods then instead of using class, you can simply 
 * use an interface in place of it. 
 * Interface is not any class.
 * Every method in an interface is public and abstract by default.
 * Interface only shows the design and it does not provide any implementation.
 * To provide an implementation of methods, you need to create a class and instantiate it.
 * Interface does not have its own memory in the heap. (variables are final)
*/

interface Smart_phone {
    // variables creation
    // (public static final, by default)
    int storage = 128;

    // abstract methods creation (only declaration)
    // (public abstract, by default)
    void call();

    void message();

    void browse();
}

// Interface can be implemented by concrete class
// (mandatory to implement all the interface methods)
class Redmi9A implements Smart_phone {

    // We could access only methods from interface and not the variables
    // In interface, variables are final so we can't change it. (final static)
    // But in child class may/mayn't be final variables, so it is accessible

    public void call() {
        System.out.println("Calling the phone...");
    }

    public void message() {
        System.out.println("Messaging the phone...");
    }

    public void browse() {
        System.out.println("Browsing the phone...");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        // No object can be created for Interface, but object could be
        // created for concrete class which implements interface
        Smart_phone mobile = new Redmi9A();
        // Accessing Interface methods by concrete class
        mobile.call();
        mobile.message();
        mobile.browse();
        // Accessing Interface variables directly (static)
        int phone_storage = Smart_phone.storage;
        System.out.println("Maximum storage of phone: " + phone_storage);
    }
}
