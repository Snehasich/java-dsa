package VTP_technical.Day7;

// SUPER IMPORTANT
// Use two pointers
// O(n)

import java.util.*;

public class ContainsWithMostWater_11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
//        int[] height = {1,1};
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] arr) {
        int max = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(arr[left], arr[right]);
            int area = minHeight * width;

            max = Math.max(area, max);

            if(arr[left] < arr[right]){
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
