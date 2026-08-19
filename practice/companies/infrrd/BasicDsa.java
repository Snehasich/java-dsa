package companies.infrrd;

import java.util.*;

public class BasicDsa {

    public static void main(String[] args) {

        // =========================
        // ARRAYS
        // =========================

        // 1. Largest
        int[] arr = {10, 5, 20, 8, 15};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);


        // 2. Second Largest
        int second = Integer.MIN_VALUE;
        largest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        System.out.println("Second Largest = " + second);


        // 3. Reverse Array
        int[] reverseArr = {10, 20, 30, 40, 50};

        int left = 0;
        int right = reverseArr.length - 1;

        while (left < right) {

            int temp = reverseArr[left];
            reverseArr[left] = reverseArr[right];
            reverseArr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array = "
                + Arrays.toString(reverseArr));


        // 4. Missing Number
        int[] missingArr = {1, 2, 3, 5};

        int n = 5;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : missingArr) {
            actualSum += num;
        }

        System.out.println("Missing = "
                + (expectedSum - actualSum));


        // 5. Duplicate
        int[] duplicateArr = {1, 2, 3, 2, 4, 1};

        HashSet<Integer> set = new HashSet<>();

        System.out.print("Duplicates = ");

        for (int num : duplicateArr) {

            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }

        System.out.println();


        // 6. Frequency
        int[] frequencyArr = {1, 2, 2, 3, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : frequencyArr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency = " + map);


        // 7. Two Sum
        int[] twoSumArr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> twoSumMap = new HashMap<>();

        for (int i = 0; i < twoSumArr.length; i++) {

            int needed = target - twoSumArr[i];

            if (twoSumMap.containsKey(needed)) {
                System.out.println("Two Sum Indexes = "
                        + twoSumMap.get(needed) + ", " + i);
                break;
            }

            twoSumMap.put(twoSumArr[i], i);
        }


        // =========================
        // STRINGS
        // =========================

        // 1. Reverse String
        String str = "Java";

        String reversed =
                new StringBuilder(str).reverse().toString();

        System.out.println("Reversed String = " + reversed);


        // 2. Palindrome
        String palindrome = "madam";

        String reverse =
                new StringBuilder(palindrome).reverse().toString();

        if (palindrome.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


        // 3. Anagram
        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }


        // 4. Character Frequency
        String text = "hello";

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char ch : text.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequency = " + charMap);
    }
}