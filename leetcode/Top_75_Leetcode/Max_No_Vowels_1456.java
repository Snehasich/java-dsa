package Top_75_Leetcode;


// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75


//Example 1:
//Input: s = "abciiidef", k = 3
//Output: 3
//Explanation: The substring "iii" contains 3 vowel letters.

//Example 2:
//Input: s = "aeiou", k = 2
//Output: 2
//Explanation: Any substring of length 2 contains 2 vowels.

//Example 3:
//Input: s = "leetcode", k = 3
//Output: 2
//Explanation: "lee", "eet" and "ode" contain 2 vowels.



public class Max_No_Vowels_1456 {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(s,k));
    }

//    static int maxVowels(String s, int k) {
//        int max = 0;
//        for(int i = 0; i <= s.length()-k; i++) {
//            int count = 0;
//            for(int j = i; j <= i+k-1; j++) {
//                if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u') {
//                    count++;
//                }
//            }
//
//
//            max = Math.max(count, max);
//        }
//
//        return max;
//    }


    static int maxVowels(String s, int k) {

        int count = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int max = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Character leaving the window
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            // Character entering the window
            if (isVowel(s.charAt(i))) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    static boolean isVowel(char ch) {
        return ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u';
    }
}

