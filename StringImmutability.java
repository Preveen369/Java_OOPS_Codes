
public class StringImmutability {
    public static void main(String[] args) {
        // Immutability in Strings: 
        // Once a string object is created, it can't be changed
        // else, a new copy of the same object to be created

        // NOTE: STRING OBJECTS ARE STORED IN SPECIAL AREA 
        // OF HEAP MEMORY, KNOWN AS STRING CONSTANT POOL

        String name = "Preveen"; // addr = 100
        name = name + "Selva";   // addr = 101
        // finally name ->> 101
        // garbage collection: 100   
        System.out.println(name);

        // both references pointing to same object in heap
        String name1 = "Sanjai";    // addr = 103
        String name2 = "Sanjai";    // addr = 103
        // finally name1 ->> 103
        // finally name2 ->> 103
        System.out.println(name1==name2);

    }
}
