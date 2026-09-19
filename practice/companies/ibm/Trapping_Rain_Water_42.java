package companies.ibm;

// https://leetcode.com/problems/trapping-rain-water/description/

public class Trapping_Rain_Water_42 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};       // output : 6

        System.out.println(trap(height));
    }

    static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int leftmax = 0;
        int rightmax = 0;

        int water = 0;

        while(left <= right) {
            if(height[left] <= height[right]) {         // if true, then we will check left side
                if(height[left] >= leftmax) {
                    leftmax = height[left];
                } else {
                    water += leftmax - height[left];
                }

                left++;
            } else {                // else go to right side
                if (height[right] >= rightmax) {
                    rightmax = height[right];
                } else {
                    water += rightmax - height[right];
                }

                right--;
            }
        }

        return water;
    }
}
