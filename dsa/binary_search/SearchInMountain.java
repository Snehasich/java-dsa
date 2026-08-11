package binary_search;

public class SearchInMountain {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1) {
            return firstTry;
        }
        // try to search second half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {

            //   start    mid    mid+1    end

            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // you may be in the desending part of array
                // this may be ans but look at left
                end = mid;
            } else {
                // are in ascending part of array
                start = mid + 1;   // because  wkt mid+1 > mid element
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // find whether the array is sorted in asc or desc;
        boolean isAsc = arr[start] < arr[end];    // if 2 < 100 then return true else return false

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
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
