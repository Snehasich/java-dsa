package Basic.strings;

//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"

//Example 2:
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.



public class Longest_Common_Prefix_14 {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(str));
    }

    static String longestCommonPrefix(String[] str) {
        String prefix = str[0];
        for(int i=0; i<str.length; i++) {
            while(!str[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
