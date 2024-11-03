class ExThrows{
    // throws keywords predicts the exception but ducks(passes the responsibility) 
    // from one statement/method to another method (make to handle them):

    // Here, the main() method handles above exception
    public void show() throws ClassNotFoundException{
        Class.forName("Clk"); //Demo.class
    }
}

// Never pass throws statement in the main method:
// Because, it asks JVM to handle the exception which is WRONG!!

public class DuckingExceptionThrows {
    static{
        System.out.println("Class Loaded...");
    }
    public static void main(String[] args)  {
        ExThrows obj = new ExThrows();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
