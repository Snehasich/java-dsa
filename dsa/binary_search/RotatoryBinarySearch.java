package binary_search;//  AMAZON && GOOGLE


public class RotatoryBinarySearch {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you dont have the pivot then it means the array is not rotated
        if(pivot == -1) {
            // just do normal arr search
            return binarySearch(nums,target,0,nums.length-1);
        }

        // if pivot is found you have found 2 assending arrays

        if(nums[pivot] == target) {
            return pivot;
        }

        if(target >= nums[0]) {
            return binarySearch(nums,target,0,pivot-1);
        }

        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarySearch(int[] arr, int target,int start,int end) {

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid+1]) {    // 7 > 0
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]) {    // 5 < 6
                return mid-1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    // if duplicate is present
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid+1]) {    // 7 > 0
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]) {    // 5 < 6
                return mid-1;
            }

            // if ele at mid,start,end are equal then just skip that duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates

                // note: what if these ele at start and end were the pivot??
                // Arrays.check if start is pivot
                if(arr[start] > arr[start+1]) {
                    return start;
                }
                start++;

                // Arrays.check whether end is pivot
                if(arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
