class Outer{
    int collect;

    public void show(){
        System.out.println("in show...");
    }

    // static keyword can be used only in inner class:
    /*static*/ class Inner {
        public void config(){
            System.out.println("in config...");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        // object (instance) creation of outer class:
        Outer obj = new Outer();
        obj.show();

        // object creation of inner class (non-static):
        Outer.Inner obj1 = obj.new Inner();
        obj1.config();

        // no object creation of inner class (static):
        // Outer.Inner obj2 = new Outer.Inner();
        // obj2.config();

    }
}
