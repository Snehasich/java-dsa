public class Palindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        boolean isPalin = true;

        char[] c = s.toCharArray();

        for(int i=0; i<s.length() / 2; i++) {
            if (c[i] != c[s.length() - i - 1]) {
                isPalin = false;
            }
        }

        return isPalin;
    }
}
