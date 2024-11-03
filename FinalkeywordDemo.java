/* final */ class CasioCalc {
    // if to stop inheritance concept
    public /* final */ void show() {
        System.out.println("In calc show...");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCasioCalc extends CasioCalc {
    // need to stop method overriding
    public void show() {
        System.out.println("In advanced calc show...");
    }
}

public class FinalkeywordDemo {
    // final keyword -> variable, class, methods
    // for variables -> to make constants, unable to reassign them.
    // for classes -> to stop the inheritance concept.
    // for methods -> to stop the method overriding.

    public static void main(String[] args) {
        // to make a variable constatnt
        /*final*/ int num = 10;
        num = 90;
        System.out.println(num);

        // to stop inheritannce and overriding
        AdvCasioCalc calc = new AdvCasioCalc();
        calc.show();
        calc.add(4, 5);
    }
}
