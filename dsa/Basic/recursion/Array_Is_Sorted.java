package Basic.recursion;

import java.util.ArrayList;

public class Array_Is_Sorted {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(isSorted(arr));
    }

    static boolean isSorted(ArrayList<Integer> nums) {
        return recursive(nums, 0);
    }

    static boolean recursive(ArrayList<Integer> nums, int i) {
        if(i == nums.size() - 1) return true;

        if(nums.get(i) > nums.get(i+1)) return false;

        return recursive(nums, i+1);
    }
}
