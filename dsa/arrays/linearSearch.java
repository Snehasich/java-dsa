package dsa.arrays;

import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {12,23,43,45,67,4,90};
        int[][] arr2 = {
                {34,45,2,3},
                {7,9,8},
                {5,67,89,90,45}
        };
        String name = "Snehasich";
        System.out.println("Using string : " + string(name, 'z'));
        System.out.println("Using normal : " + check(arr, 13));
        System.out.println("Using start and end : " + startend(arr, 12, 2,6));
        System.out.println("Using Minimum : " + min(arr));
        int[] twoD = TwoD(arr2, 34);
        System.out.println("Using twoD : " + Arrays.toString(twoD));
        System.out.println("Maximum Wealth : " + maximumWealth(arr2));
    }

    static int check(int[] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    static int startend(int[] arr, int target, int start, int end) {
        for(int i=start;i<=end;i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean string(String str, char target) {
        for(char ch : str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }


    static int min(int arr[]) {
        int ans = arr[0];

        for(int i=1;i<arr.length;i++) {
            if(arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int[] TwoD(int[][] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int maximumWealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;

        // [4,3,2] = 9, [2,2,2] = 6, so 9 is max

        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=0; j<arr[i].length; j++) {
                sum += arr[i][j];
            }

            if(sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }

}

