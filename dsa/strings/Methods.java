package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Snehasich Samal";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('n'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println("        Snehasich         ".strip());   // remove whitespace
        System.out.println(Arrays.toString(name.split(" ")));     // whatever there is an space split it
    }
}
