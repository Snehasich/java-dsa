package practice.easy;

// Check whether a number is Palindrome

import java.util.*;

public class Palin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        palindrome(num);
    }

    static void palindrome(int num) {
        String s = String.valueOf(num);

        String rev = "";

        for(int i=s.length()-1; i>=0; i--) {
            rev += s.charAt(i);
        }

        if(s.equals(rev)) {
            System.out.println("Palin");
        } else {
            System.out.println("Not a Palin");
        }


        //     int original = num;
        //    int rev = 0;
        //
        //    while (num > 0) {
        //        int digit = num % 10;
        //        rev = rev * 10 + digit;
        //        num = num / 10;
        //    }
        //
        //    if (original == rev) {
        //        System.out.println("Palindrome");
        //    } else {
        //        System.out.println("Not a Palindrome");
        //    }
    }
}
