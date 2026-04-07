package HRD_Placement_DSA;

// Input: n = 100
//Output: [2, 5]
//Explanation: Unique prime factors of 100 are 2 and 5.

//Input: n = 60
//Output: [2, 3, 5]
//Explanation: Prime factors of 60 are 2, 2, 3, 5. Unique prime factors are 2, 3 and 5.

import java.util.ArrayList;

public class PrimeFactor {
    public static void main(String[] args) {

        int n = 15;

        factor(n);
    }

    static void factor(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                arr.add(i);

                // remove duplicate factors
                while(n % i == 0) {
                    n /= i;
                }
            }
        }

        // last remaining one to print
        if(n > 2) {
            arr.add(n);
        }

        System.out.println(arr);
    }
}
