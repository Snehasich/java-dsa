package companies.ibm.Solve_This;

// https://leetcode.com/problems/daily-temperatures/description/

import java.util.*;

public class Daily_Temp_739 {
    public static void main(String[] args) {
        int[] temp = {73,74,75,71,69,72,76,73};     // output -> [1, 1, 4, 2, 1, 1, 0, 0]

        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }


    static int[] dailyTemperatures(int[] arr) {
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
