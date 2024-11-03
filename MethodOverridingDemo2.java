// METHOD OVERRIDING - 2:
class Calc{
    // original methods in superclass
    public int add(int x1, int x2){
        return x1+x2;
    }

    public int divide(int x1, int x2){
        return x1/x2;
    }
}

class AdvCalc extends Calc{
    // Method overrided in subclass
    public int add(int x1, int x2){
        return (x1+x2)+1;
    }
}

class MethodOverridingDemo2 {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(4,6));
        System.out.println(obj.divide(8,6));
    }
}

