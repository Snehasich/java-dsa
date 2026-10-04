package Basic.strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "hannah";

        System.out.println(palindromeCheck(s));
    }

    static boolean palindromeCheck(String s) {
        StringBuilder rev = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            rev.append(s.charAt(s.length() - i - 1));
        }

        return rev.toString().equals(s);
    }
}
