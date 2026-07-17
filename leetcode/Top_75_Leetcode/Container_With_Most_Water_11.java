package Top_75_Leetcode;

// https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

//Example 2:
//Input: height = [1,1]
//Output: 1



public class Container_With_Most_Water_11 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(height));
    }

    static int maxArea(int[] arr) {
        int left  = 0;
        int right = arr.length - 1;

        int max = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(arr[left], arr[right]);
            int area = width * minHeight;

            max = Math.max(area, max);

            if(arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
