package easy;

// https://leetcode.com/problems/plus-one/description/
// 66. Plus One


// Example 1:
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].

// Example 2:
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].

// Example 3:
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].

// Input = [8,9,9,9]
//Output = [9,0,0,0]


import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,8,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {    // 9,9,9,0,0
        for(int i=digits.length-1; i>=0; i--) {         // check from last
            if(digits[i] < 9) {
                digits[i]++;        // here increment value not index
                System.out.println("Digits : " + Arrays.toString(digits));
                return digits;
            }
            digits[i] = 0;      // if it is 9 then assign the value as 0
        }

        // think every digits are 9 like [9,9,9]      999+1 = 1000 where result will add 1 and then digits will become 0
        int[] result = new int[digits.length+1];
        result[0] = 1;
        System.out.println("Result : " + Arrays.toString(result));

        return result;
    }
}