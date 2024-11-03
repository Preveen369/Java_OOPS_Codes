public class ClonableCloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Clone of Objects:- Cloning is the process of actually making another exact replica
        // of the object instead of its reference.
        // Cloneable interface, Object clone() protected method

        Book bk1 = new Book();
        bk1.name = "Robinson Crusoe";
        bk1.id = 1000;

        // type casting the clone() from Object to Book type:
        Book bk2 = (Book)bk1.clone();
        bk2.id = 1010;  // doesn't affect the value of bk1.id

        System.out.println(bk1);
        System.out.println(bk2);

    }
}

// Cloneable: a marker interface to give permission for accessing clone() method:
// clone(): a protected method of the java.lang.Object class
// it may/may not throws the CloneNotSupportedException (must handle it)
class Book implements Cloneable{
    String name;
    int id;

    @Override
    public String toString() {
        return "Book [name = " + name + ", id = " + id + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}