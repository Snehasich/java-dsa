import javax.swing.*;

public class Practs {
    public static void main(String[] args) {
        int[] arr = {3,0,1};

        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
//        int k = 0;

//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr.length; j++) {
//                if(arr[j] == k) {
//                    k++;
//                }
//            }
//        }



        return check(arr, 0);
    }

    static int check(int[] arr, int n) {
        if(arr.length == n) {
            return n;
        }

        for (int num : arr) {
            if (num == n) {
                return check(arr, n + 1);
            }
        }

        return n;
    }
}
