package Top_75_Leetcode;


// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75

// Example 1:
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"

//Example 2:
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"

//Example 3:
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""

//Example 4:
//Input: str1 = "AAAAAB", str2 = "AAA"
//Output: ""


public class Greatest_Common_Divisor_Strings_1071 {
    public static void main(String[] args) {
        String str1 = "ABABAB", str2 = "ABAB";

        System.out.println(gcdOfStrings(str1, str2));
    }

    static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int len = gcd(str1.length(), str2.length());

        return str1.substring(0, len);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}