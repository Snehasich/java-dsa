package VTP_technical.Day2;

//  Amazon, Microsoft, Google, Adobe

import java.util.*;


public class ProductOfArrayExceptFirst_238 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(check(arr)));
        System.out.println(Arrays.toString(checkOptimise(arr)));
    }

    static int[] check(int[] arr) {
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if(i != j) {
                    product *= arr[j];
                } else {
                    continue;
                }
            }
            temp[i] = product;
        }

        return temp;
    }



    static int[] checkOptimise(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int prefix = 1;

        // Store prefix products
        for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix *= arr[i];
        }

        int suffix = 1;

        // Multiply by suffix products
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= arr[i];
        }

        return ans;
    }
}
