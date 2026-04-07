package placement.HRD_Placement_DSA;

// Input: 6
//Output: 3
//Explanation Prime factor are 2 and 3. Largest of them is 3.

//Input: 15
//Output: 5
//Explanation: Prime factors are 3 and 5. The largest of them is 5.

//Input: 28
//Output: 7
//Explanation: Prime factors are 2 and 7. The largest of them is 7.

import java.util.ArrayList;

public class PrimeFactorization {
    public static void main(String[] args) {

        int n = 6;
        factor(n);
    }

    static void factor(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {

                arr.add(i);

                while(n % i == 0) {
                    n /= i;
                }
            }
        }

        if(n > 2) {
            arr.add(n);
        }

        for(int i : arr) {
            if(i > max) {
                max = i;
            }
        }

        System.out.println(arr);
        System.out.println(max);

    }
}
