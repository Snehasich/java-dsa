package companies.infrrd.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";

        System.out.println(anagram(s1, s2));
    }

    static String anagram(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2) ? "Anagram" : "Not Anagram";
    }
}
