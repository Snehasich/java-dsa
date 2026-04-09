package dsa.arrays;

import java.util.*;

class prac {
    public static void main(String[] args) {
        int[] arr = {6,3,2,1,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {6,3,2,1,4};
        selection(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {6,3,2,1,4};
        insertion(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {6,3,2,1,4};
        cyclicSort(arr4);
        System.out.println(Arrays.toString(arr4));
    }

    static int[] bubble(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    static void selection(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            swap(arr,smallest,i);
        }
    }

    static void insertion(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }
            }
        }
    }

    static int cyclicSort(int[] arr) {
        int i=0;

        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }

        for(int index=0; index < arr.length; index++) {
            if(arr[index] != index) {
                return index;
            }
        }
        return -1;
    }


    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
