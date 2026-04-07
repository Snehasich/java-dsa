package DSA.Arrays;

public class binarySearch {

    public static void main(String[] args) {
        //binary should be sorted
        int[] arr = {1,3,5,7,10,13,16};
        System.out.println(binary(arr,7));
    }


    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
}
