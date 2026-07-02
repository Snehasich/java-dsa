package VTP_technical.Day4;

// O(log n)
// Very Important

public class SearchRotatedSortedArray_33 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(nums, target));
    }

    static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] >= arr[left]) {
                if (target > arr[mid] || target < arr[left]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else  {
                if (target < arr[mid] || target > arr[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;

    }
}
