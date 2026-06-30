package VTP_technical.Day2;

public class string {
    public static void main(String[] args) {
        String a = new String("A");     // create a String objects in the heap
        String b = "A";                         // String Pool -> stores string literals in a special memory area called the String Pool.
        String c = "A";

        System.out.println(a == b ? "Equal" : "Not Equal");
        System.out.println(c == b ? "Equal" : "Not Equal");
        System.out.println(a.equals(b) ? "Equal" : "Not Equal");
        System.out.println(a.length());         // return length of string
        System.out.println(a.charAt(0));        // Returns a character at a position
        System.out.println(a.substring(0));         // method is used to extract part of a string.
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.startsWith("A"));
        System.out.println(a.replace("A", "B"));    // replace A with B
        System.out.println(a.endsWith("A"));
        System.out.println(a.isEmpty());

        System.out.println(a.concat(" Java"));

        String str = "     Trim      /";
        System.out.println(str.trim());

    }
}