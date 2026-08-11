package strings;

import java.util.*;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // here output will be 195 because it is showing ashka value and adding that
        System.out.println("a" + "b"); // ab
        System.out.println('a' + 3); // 100
        System.out.println((char)('a' + 3)); // d
        System.out.println("a" + 1); //a1
        //this is same as after a few steps "a" + "1";
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());  // ArrayList is not a String
        System.out.println("kunal" + new Integer(56)); // here Integer is an Object

        // System.out.println(new Integer(56) + new ArrayList<>());
        // ERROR occurs because '+' in java used only in Primitive and used in complect objects as well but atleast one object should be in type String

        System.out.println(new Integer(56) + "" + new ArrayList<>()); // this will work because String is used here

        System.out.println("a" + 'b'); // ab
    }
}
