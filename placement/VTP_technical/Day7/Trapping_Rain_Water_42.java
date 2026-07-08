package VTP_technical.Day7;

// SUPER IMPORTANT

public class Trapping_Rain_Water_42 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(height));
    }

    static int trap(int[] arr) {
        int ans = 0;
        int left = 0;
        int right = arr.length - 1;

        int leftmax = 0;
        int rightmax = 0;

        while(left < right) {
            if(arr[left] < arr[right]) {
                if(arr[left] > leftmax) {
                    leftmax = arr[left];
                }
                ans += leftmax - arr[left];
                left++;
            } else {
                if(arr[right] > rightmax) {
                    rightmax = arr[right];
                }
                ans += rightmax - arr[right];
                right--;
            }
        }

        return ans;
    }
}
