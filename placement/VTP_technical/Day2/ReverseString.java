package VTP_technical.Day2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(s);
        rev(s);

        // System.out.println(new StringBuilder(s).reverse());
    }

    static void rev(String s) {
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++) {
            System.out.print(c[c.length - i - 1]);
        }
    }
}
