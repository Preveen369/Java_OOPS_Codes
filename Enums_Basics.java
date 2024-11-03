enum Status {
    // special container (class) to store all named constants (objects)
    Running, Failed, Pending, Success;
}

public class Enums_Basics {
    public static void main(String[] args) {
        // Creating an object for Status enum
        // Status -> also refers to class type
        Status s = Status.Running;

        // returns the position of specified status constant
        System.out.println(s.ordinal());

        // converting a Status enum into an array
        Status[] status_consts = Status.values();

        // accessing a status constant from that array
        System.out.println(status_consts[2]);

        // retrieving all the constants from status array
        for (Status st : status_consts) {
            System.out.println(st);
        }

        // CASE STUDY
        // Eg: say for, If we are performing a payment transaction in an app
        System.out.println("\n===Payment transaction of an app:===");
        Status payment_status = Status.Running;

        /*// conditional-statements using enums
        if (payment_status == Status.Failed) {
            System.out.println("Payment failed!!");
        } else if (payment_status == Status.Running) {
            System.out.println("Processing payment...");
        } else if (payment_status == Status.Pending) {
            System.out.println("Payment Pending...");
        } else {
            System.out.println("Payment success!");
        }*/

        // switch-statements using enums
        switch (payment_status) {
            case Running:
            System.out.println("Processing payment...");
                break;
            case Failed:
                System.out.println("Payment failed!!");
                break;
            case Pending:
                System.out.println("Payment Pending...");
                break;
            default:
            System.out.println("Payment success!");
                break;
        } 
    }
}
