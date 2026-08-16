package companies;

import java.util.*;

public class missing_element {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,5};

        System.out.println(missing(arr));
    }

    static int missing(int[] arr) {
        int[] ans = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            ans[arr[i] - 1] = 1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(ans[i] == 0) {
                return i+1;
            }
        }

        return -1;
    }
}
