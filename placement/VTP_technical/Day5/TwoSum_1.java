package VTP_technical.Day5;

// V IMP

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

//    static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i<nums.length; i++) {
//            for(int j=i+1; j<nums.length;j++){
//                if(nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i<nums.length; i++) {
            for(int j=i; j<nums.length;j++){
                if(nums[j]+nums[j - i] == target) {
                    return new int[]{j, j-i};
                }
            }
        }
        return null;
    }


    // optimize code using XOR
    static int twoSumOptimize(int[] arr, int target) {
        int n = arr.length;
        int x1 = 0;
        int x2 = 0;

        // XOR add all actual elements inside the array
        for(int i=0;i<n;i++){
            x1 ^= arr[i];
        }

        // XOR all expected elements from 1 to n+1
        for(int i=1;i<=n+1;i++){
            x2 ^= i;
        }

        return x1 ^ x2;
    }




    // optimize code using HashMap
    static int[] twoSumOptimizeHashMap(int[] arr, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        int current;
        for(int i=0;i<arr.length;i++){
            current = arr[i];
            if(map.containsKey(target-current)){
                result[0] = 1;
                result[1] = map.get(target-current);
                return result;
            } else {
                map.put(current,i);
            }
        }

        return result;
    }
}
