package strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 342.3248f;
        // % -> placeholder
        System.out.printf("Formatted number is %.2f", a);
        System.out.println();
        System.out.printf("Pie : %.3f", Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and i am from %s", "Snehasich", "Odisha");
    }
}
