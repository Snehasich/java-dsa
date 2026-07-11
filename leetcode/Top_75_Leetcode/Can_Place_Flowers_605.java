package Top_75_Leetcode;

// https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75


// Example 1:
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true

//Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false


import java.util.Arrays;

public class Can_Place_Flowers_605 {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            boolean leftEmpty = (i == 0) || flowerbed[i - 1] == 0;

            boolean rightEmpty = (i == flowerbed.length - 1) || flowerbed[i + 1] == 0;

            if (flowerbed[i] == 0 && leftEmpty && rightEmpty) {
                flowerbed[i] = 1;
                count++;
            }
        }

        System.out.println(Arrays.toString(flowerbed));


        return count >= n;
    }
}