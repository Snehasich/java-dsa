package easy;

// Concept: StringBuilder, append(), reverse(), mutable strings.
// Problem: Reverse Words in a String III – LeetCode 557

import java.util.Arrays;

public class reverseUsingStringBuilder {
    public static void main(String[] args) {

        StringBuilder br = new StringBuilder();
        br.append("Samal is a dancer");
//        reverse(br);
    }

    static String reverse(String br) {

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for(int i=0; i<br.length(); i++) {
            char ch = br.charAt(i);

            if(ch != ' ') {
                temp.append(ch);
            } else {
                result.append(temp.reverse());
                result.append(' ');
                temp.setLength(0);
            }
        }


        result.append(temp.reverse());

        return result.toString();

    }
}
