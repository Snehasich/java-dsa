package Basic.recursion;

import java.util.*;

public class Reverse_String {
    public static void main(String[] args) {
        ArrayList<Character> s = new ArrayList<>();

        s.add('H');
        s.add('E');
        s.add('L');
        s.add('L');
        s.add('O');

        System.out.println(reverseString(s));
    }

    static ArrayList<Character> reverseString(ArrayList<Character> s) {
        reverse(s, 0, s.size()-1);

        return s;
    }

    static void reverse(ArrayList<Character> s, int left, int right) {
        if(left >= right) return;

        // swap
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);

        reverse(s, left+1, right-1);
    }
}
