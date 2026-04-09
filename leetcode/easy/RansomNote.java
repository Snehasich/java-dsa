package easy;

import java.util.Arrays;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "fihjjjjei", magazine = "hjibagacbhadfaefdjaeaebgi";

        System.out.println(canConstruct(ransomNote, magazine));;
    }

    static boolean canConstruct(String ransomNote, String magazine) {

        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int i=0, j=0;

        while(i < a.length && j < b.length) {
            if(a[i] == b[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i == a.length;
    }

}
