package binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,45,67,78,89,100};
        int target = 78;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in asc or desc;
        boolean isAsc = arr[start] < arr[end];    // if 2 < 100 then return true else return false

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {                     // ascending order
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {                        // descending order
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
