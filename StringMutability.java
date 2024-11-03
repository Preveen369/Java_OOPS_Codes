
public class StringMutability {
    public static void main(String[] args) {
        // Mutability in Strings: 
        // Once a stringbuffer/stringbuilder object is created
        // it could be modified whose changes get reflected

        // NOTE: STRING OBJECTS ARE STORED IN SPECIAL AREA 
        // OF HEAP MEMORY, KNOWN AS STRING CONSTANT POOL

       StringBuffer sbstr = new StringBuffer("Preveen");
       System.out.println(sbstr.capacity());        // 16+7=23
       System.out.println(sbstr.length());

       System.out.println(sbstr.append(" Selvanathan"));
       System.out.println(sbstr.charAt(5));

       sbstr.ensureCapacity(35);    // 23+35=48
       System.out.println(sbstr.capacity());

       sbstr.setLength(40);

       System.out.println(sbstr.insert(8, "fullstack "));
       System.out.println(sbstr.length());

       String str = sbstr.toString();
       System.out.println(str);

       // StringBuffer & StringBuilder classes are similar
       // StringBuffer -> thread-safe
       // StringBuilder -> not thread-safe
    }
}
