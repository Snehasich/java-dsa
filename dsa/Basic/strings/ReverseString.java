package Basic.strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};

        System.out.println(Arrays.toString(reverseString(ch)));;
    }

    static char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

        return s;
    }
}
