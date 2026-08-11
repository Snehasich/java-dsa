package binary_search;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {12,23,34,45,56,67,78,89,90};
        int ele = range(arr,34,1,7);
        System.out.println(ele);


    }

    static int range(int[] arr, int target, int start, int end) {

        if(arr.length == 0) {
            return -1;
        }

        for(int i=start;i<=end;i++) {
            int ele = arr[i];
            if(ele == target) {
                return i;
            }
        }
        return -1;
    }
}
