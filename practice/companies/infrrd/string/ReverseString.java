package companies.infrrd.string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";

        reverse(str);
    }

    static void reverse(String s) {
        String rev = "";

        for(int i = s.length()-1; i >= 0; i--){
            rev += s.charAt(i);
        }

        System.out.println(rev);
    }
}
