
class Human {
    private int age;
    private String name;
    private String rollno;

    // CONSTRUCTOR OVERLOADING: same constructor name, different parameters used;
    // creating default constructor (no-args)
    public Human() {
        age = 12;                   // NOTE: DEFAULT CONSTRUCTORS AUTOMATICALLY
        name = "Preveen";           // CALLED EVEN IF NOT EXPLICITLY SPECIFIED
        rollno = "22ITA50";
    }

    // creating parameterized constructors
    public Human(int age, String name, String rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }

    public Human(String name) {
        this.name = name;
    }

    // accessing the data's (getter() method)
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    // setting the data's (setter() method)
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // CONSTRUCTORS: it's a special method which is automatically called, whenever
        // the object gets created, to initialize the default object's values:
        Human obj = new Human();
        Human obj1 = new Human(15, "Sanjai", "22ITA54");
        Human obj2 = new Human("Ragul");

        System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getRollno());
        System.out.println(obj1.getName() + " : " + obj1.getAge() + " : " + obj1.getRollno());
        System.out.println(obj2.getName() + " : " + obj2.getAge() + " : " + obj2.getRollno());

    }
}
