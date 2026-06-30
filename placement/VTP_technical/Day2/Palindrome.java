package VTP_technical.Day2;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String s = new Scanner(System.in).nextLine();
        palin(s);
    }


    static void palin(String s) {
        String temp = "";

        // reverse
        for (int i = s.length()-1; i >= 0; i--) {
            temp += s.charAt(i);
        }

        // compare
        if(s.equals(temp)) {
            System.out.println("Palin");
        } else {
            System.out.println("Not Palin");
        }
    }


    // two pointers  (Optimize)
    static void palinOptimise(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("Not Palin");
                return;
            }
            i++;
            j--;
        }

        System.out.println("Palin");
    }
}
