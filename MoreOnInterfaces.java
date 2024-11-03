// MORE ON INTERFACES
/* 
 * class - class -> extends
 * class - interface -> implements
 * interface - interface -> extends
 */

interface Arm {
    int age = 20; // fixed-constants
    String area = "Madurai";

    void show(); // abstract-methods

    void config();
}

interface Xam {
    void run();
}

interface Yam extends Xam {

}

// class can implement multiple interfaces
// class can extend only one abstract class
class Cam implements Arm, Yam {
    public void show() {
        System.out.println("In Arm's show");
    }

    public void config() {
        System.out.println("In Arm's config");
    }

    public void run() {
        System.out.println("In Xam's run");
    }
}

// you can only call those methods by that reference that are present
// in that interface of which the refernce is created.
public class MoreOnInterfaces {
    public static void main(String[] args) {
        Arm obj = new Cam();
        obj.show(); // -> only access methods which is present
        obj.config(); // -> inside Arm interface reference
        // obj.run() -> can't access run() method

        Xam obj1 = new Cam();
        obj1.run(); // present in Xam interface reference
    }
}
