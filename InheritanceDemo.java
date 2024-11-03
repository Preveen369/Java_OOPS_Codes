import com.tools.VeryAdvCalc;   // reverse internet domain pkg name
// only access various (*) files from the pkg, not the folders

public class InheritanceDemo {
    public static void main(String[] args) {
        // INHERITANCE: performs code reusability among the parent and the child classes
        // and create better connections between multiple classes.
        // Inheriting all properties and methods from parent class to the child class.

        // For inheritance, we only required the class file. There is no need for a java file.
        // "extends" keyword is used in inheritance to inherit properties of a parent class.

        // Types: Single-level; Multi-level; Multiple
        // Rough rog = new Rough(); // directly import com

        VeryAdvCalc obj = new VeryAdvCalc();
        int res1 = obj.add(3, 5);
        int res2 = obj.sub(17, 8);
        int res3 = obj.mul(5, 8);
        int res4 = obj.div(16, 4);
        double res5 = obj.power(4, 2);
        System.out.println(res1 + " " + res2 + " " + res3 + " " + res4 + " " + res5);

    }
}