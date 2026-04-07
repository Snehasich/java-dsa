package dsa.stack;

// Problem: Implement Stack using Array – GFG

import java.util.Stack;

public class StackArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(stackArray(a));
    }

    static String stackArray(int[] arr) {

        Stack<Integer> s = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            s.push(arr[i]);
        }
        System.out.println(s);


        int insert = 50;
        System.out.print("\nInsert " + insert + " into this : ");
        s.push(insert);
        System.out.println(s);


        System.out.print("\nDelete last element : ");
        s.pop();
        System.out.println(s);


        System.out.print("\nPeek element : ");
        Integer peek = s.peek();
        System.out.println(peek);



        return "\nLastly, Finally, totally : " + s;
    }
}
