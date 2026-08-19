package companies.infrrd.arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
}
