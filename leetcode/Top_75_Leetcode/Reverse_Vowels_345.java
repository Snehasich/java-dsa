package Top_75_Leetcode;

// https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75

// Example 1:
//Input: s = "IceCreAm"
//Output: "AceCreIm"

// Example 2:
//Input: s = "leetcode"
//Output: "leotcede"


public class Reverse_Vowels_345 {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    static String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            while(left < right && !isVowel(arr[left])) left++;          // Keep moving left until you find a vowel.

            while(left < right && !isVowel(arr[right])) right--;        // Move from right until a vowel is found.

            swap(arr, left, right);

            left++;
            right--;
        }

        return new String(arr);
    }

    static boolean isVowel(char c){
        c = Character.toLowerCase(c);

        return c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u';
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
