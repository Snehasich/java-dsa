package VTP_technical.Day7;

public class Count_Prefixes_Given_String_2255 {
    public static void main(String[] args) {
        String[] str = {"a","b","c","ab","bc","abc"};
        String s = "abc";

        System.out.println(countPrefixes(str, s));

    }

    static int countPrefixes(String[] words, String s) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if(s.startsWith(words[i])) {
                count++;
            }
        }

        return count;
    }
}
