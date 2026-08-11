package strings;

public class Comparison {
    public static void main(String[] args) {

        // String are immutable so SECURITY is best here

        // here it is in same pool(inside pool)
        String name = "Snehasich";
        String z = "Snehasich";
        System.out.println(name == z);


        // here it is outside String pool but in HEAP
        String a = new String("Samal");
        String b = new String("Samal");
        System.out.println(a == b);  // false because it making new objects(different objects)
        System.out.println(a.charAt(0));
    }
}
