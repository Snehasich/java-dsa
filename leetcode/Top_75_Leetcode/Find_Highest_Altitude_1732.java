package Top_75_Leetcode;

// https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

//Example 2:
//Input: gain = [-4,-3,-2,-1,4,3,2]
//Output: 0
//Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

public class Find_Highest_Altitude_1732 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};

        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        int ans = 0;

        prefix[0] = 0;

        for(int i = 1; i <= gain.length; i++) {
            prefix[i] = prefix[i - 1] + gain[i - 1];

            ans = Math.max(ans, prefix[i]);
        }


        return ans;
    }
}
