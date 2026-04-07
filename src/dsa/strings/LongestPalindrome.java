package dsa.strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "banana";
        char[] c = s.toCharArray();
        System.out.println(recursion(c, 0, s.length()-1));
    }

    static int recursion(char[] str, int left, int right) {
        if(left == right) {
            return 1;
        } else if(left + 1 == right && str[left] == str[right]) {
            return 2;
        } else if(str[left] == str[right]) {
            return 2 + recursion(str, left+1, right-1);
        } else {
            return Math.max(recursion(str,left,right-1), recursion(str,left+1,right));
        }
    }
}
