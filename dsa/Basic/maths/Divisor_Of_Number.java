package Basic.maths;

//Example 1:
//Input: n = 6
//Output = [1, 2, 3, 6]
//Explanation: The divisors of 6 are 1, 2, 3, 6.

//Example 2:
//Input: n = 8
//Output: [1, 2, 4, 8]
//Explanation: The divisors of 8 are 1, 2, 4, 8.

import java.util.ArrayList;
import java.util.Arrays;

public class Divisor_Of_Number {
    public static void main(String[] args) {
        int n = 6;

        System.out.println(Arrays.toString(divisors(n)));
    }

    static int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
