package companies.ibm.Solve_This;

// https://leetcode.com/problems/jump-game-ii/description/

public class Jump_Game_II_45 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        //Time:  O(n)
        //Space: O(1)

        System.out.println(jump(arr));
    }

    static int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
