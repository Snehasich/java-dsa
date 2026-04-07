// 387. First Unique Character in a String

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {

        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    static int firstUniqChar(String s) {

        int[] count = new int[26];  // only 26 lowercase letters

        // Step 1: count letters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }

        // Step 2: find first unique
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (count[ch - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
