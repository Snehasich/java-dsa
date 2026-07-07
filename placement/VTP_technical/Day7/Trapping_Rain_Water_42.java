package VTP_technical.Day7;

// SUPER IMPORTANT

public class Trapping_Rain_Water_42 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(height));
    }

    static int trap(int[] arr) {
        int ans = 0;
        int min = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                for (int j = 0; j <= i; j++) {
                    min += arr[j];
                }
                ans = Math.max(ans, min);

            }
        }

        return ans;
    }
}
