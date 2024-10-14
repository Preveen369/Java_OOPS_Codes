// Anonymous Inner Class:
// Abstract and Anonymous Inner Class:

/* Anonymous Inner Classes allow us to extend a class or implement
an abstract class without explicitly naming the subclass. 
This technique is useful for quick modifications without creating 
a separate subclass file. */

// When an object calls a concrete-method / abstract-method it first checks
// method's implementation of the inner-class, else checks the original 
// concrete / abstract class's method implementation.

class Details {
    public void display() {
        System.out.println("Preveen S, 22ITA50");
    }
}

abstract class Design {
    public abstract void sketch();

    public abstract void component();

    public void color() {
        System.out.println("Painted Blue Color");
    };
}

public class AnonymousInnerclass {
    public static void main(String[] args) {
        // name of anonymous inner class object => Details (since no name)
        Details obj = new Details() {
            // overriding method implementation:
            public void display() {
                System.out.println("Ragul MKG, 22ITA51");
            }
        };
        // returns new implementation of display()
        obj.display();

        // name of anonymous inner class object => Design (since no name)
        Design frame = new Design() { // the inner class's object is created
            // implementation of abstract methods:
            public void sketch() {
                System.out.println("Sketching wireframe...");
            }

            public void component() {
                System.out.println("Created the compnent...");
            }

            // overriding method implementation:
            public void color() {
                System.out.println("Painted Green Color");
            };

        };

        // when these methods are invoked it returns
        // the new implementation of methods
        frame.sketch();
        frame.component();
        frame.color();
    }
}
