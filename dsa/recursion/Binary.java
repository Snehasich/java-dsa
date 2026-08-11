package recursion;

public class Binary {
    public static void main(String[] args) {
        // 3 types in Variables
        // in the argument, return type, body of function


        // binary Search With Recursion

        // F(n) = O(1) + F(N/2)       ->   recurrence relation
        //    comparison   dividing arr in half


        // types of recurrence relation
        // linear recurrence relation   -> fibonacci
        // divide and conquer recurrence relation   -> binary search


        int[] arr = {1,2,3,4,67,89,90};

        System.out.println(search(arr, 67, 0, arr.length-1));
        System.out.println(normal(arr, 67));
    }

    static int search(int[] arr, int target, int s, int e) {

        if(s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == target) {
            return m;
        }
        if(target < arr[m]) {
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }


    static int normal(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;


        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
