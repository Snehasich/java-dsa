package DSA.Arrays;

import java.util.Arrays;

//Idea: – Push big elements to the end
//Compare neighbors and swap if they are in the wrong order.
//How it thinks:
//Compare adjacent elements
//Largest value bubbles up to the end in each pass

//📌 Example
//Array: 8 3 5
//Steps:
//        8 3 5 → swap → 3 8 5
//        3 8 5 → swap → 3 5 8

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,10,3,1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=1;j<arr.length-i;j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}