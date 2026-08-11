package arrays;

public class Mountain {
    public static void main(String[] args) {

        int[] arr = {0,1,0};

        System.out.println(peakIndexInMountainArray(arr));

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
}
