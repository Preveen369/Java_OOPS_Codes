
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        String subject = new String("Mathematics");
        System.out.println(subject);
        
        System.out.println(subject.hashCode());
        System.out.println(subject.charAt(6));

        System.out.println(subject.concat(" Squads!!"));
        System.out.println(subject.indexOf("emat"));
        System.out.println(subject.indexOf('a'));

        char[] words = subject.toCharArray();
        System.out.println(Arrays.toString(words));

    }
}
