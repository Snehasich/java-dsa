package HRD_Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode_739 {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(temperatures));
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
        System.out.println(Arrays.toString(dailyTemperaturesOptimize(temperatures)));
    }

    static int[] dailyTemperatures(int[] arr) {
        int temp[] = new int[arr.length];

        for(int i=0; i<arr.length-1; i++) {
            int count = 0;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] < arr[j]) {
                    count = j - i;
                    break;
                }
            }

            temp[i] = count;
        }

        return temp;
    }

    static int[] dailyTemperaturesOptimize(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int prevIndex = stack.pop();
                temp[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return temp;
    }
}
