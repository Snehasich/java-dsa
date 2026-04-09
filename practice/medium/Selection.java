package medium;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 3, 1};
        select(arr);
    }

    static void select(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int min = i;

            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }


        System.out.println(Arrays.toString(arr));
    }
}
