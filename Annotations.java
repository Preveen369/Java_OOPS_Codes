// Annotation is type of comment which is used to provide meta data to the 
// compiler and JVM about the program.

// It helps to avoid the logical error in the program because logical error is being
// more difficult to find when you use annotation it helps to find the logical error
// because, solving problem at compile time error is easy than solving problem at runtime 
// mostly used in the java frameworks like spring for ease of coding:

class Aa {
    public void show() {
        System.out.println("In A show..");
    }

    public void display() {
        System.out.println("In A display..");
    }
}

class Bb extends Aa {
    @Override // -> built-in annotations
    public void show() {
        System.out.println("In B show..");
    }

    /* arise of logical error in above method:
     * public void displayData(){
     *   System.out.println("In B display..");
     * }*/

    @Override
    public void display() {
        System.out.println("In B display..");
    }

}

public class Annotations {
    public static void main(String[] args) {
        Bb obj = new Bb();
        obj.show();
        obj.display();
    }
}
