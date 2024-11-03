// When we develop an application, we must ensure it's flexible
// [LOOSELY COUPLED] by using generalisation (abstraction, design):

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Coding through laptop...");
        System.out.println("Code, Compile, Run...");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Coding through desktop...");
        System.out.println("Code, Compile, Run (FASTER)...");
    }
}

class DevApplication {
    // don't use tight-coupling: dev is dependent on laptop / desktop (specialized)
    // use loose-coupling: dev is dependent on computer (generalized)
    public void devApp(Computer lap) {
        // System.out.println("Coding an application...");
        lap.code();
    }
}

public class Developer {
    public static void main(String[] args) {
        // Computer: interface / parent class reference
        // Laptop / Desktop: child class reference
        Computer lap = new Laptop();
        // Computer desk = new Desktop();

        DevApplication preveen = new DevApplication();
        preveen.devApp(lap);
    }
}
