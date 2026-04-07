package leetcode.easy;

import java.util.Arrays;

// Move Zeroes – LeetCode 283

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,5,8};
        moveZeroes(arr);
        move(arr);
        optimize(arr);
    }

    static void move(int[] arr) {

        StringBuilder b = new StringBuilder();
        StringBuilder zero = new StringBuilder();
        int n=arr.length;

        for(int i=0; i<n; i++) {
            if(arr[i] != 0) {
                b.append(arr[i] + " ");
            } else {
                zero.append(arr[i] + " ");
            }

        }

        b.append(zero);

        System.out.println(b.toString());
    }

    static void moveZeroes(int[] arr) {

        int count = 0;

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == 0) {

                for(int j=i; j<arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                count++;
                i--;
            }
        }

        for(int k=arr.length-count;k<arr.length;k++) {
            arr[k] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }


    static void optimize(int[] nums) {
        int j = 0;
        int i = 0;
        while(i<nums.length){
            // 1,0,0,0,5,8
            // 1,5,0,0,0,8
            // 1,5,8,0,0,0

            // 1,2,3,0,5   i=0,i=1, j=1
            // 1,2,3,0,5   i=1,i=2, j=2
            // 1,2,3,0,5   i=2,i=3, j=3
            // 1,2,3,0,5   i=4,i=4, j=3
            // 1,2,3,5,0   i=5,i=5, j=3
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
