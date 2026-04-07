package dsa.stack;

// Day 38 – Stack Basics
// Concept: LIFO structure, operations (push, pop, peek), using array.
// Problem: Implement Stack using Array – GFG
// Goal: Understand stack fundamentals.

import java.util.*;

public class StackBasic {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        push(a);
        pop(a);
        peak(a);
    }

    static void push(int[] a) {

        int top = 1;

        int num = 100;

        int size = a.length + top;

        a = Arrays.copyOf(a, size);

        a[a.length-1] = num;

        System.out.println(Arrays.toString(a));
    }

    static void pop(int[] a) {

        int top = 1;

        int size = a.length - top;

        a = Arrays.copyOf(a, size);


        System.out.println(Arrays.toString(a));
    }

    static void peak(int[] a) {

        System.out.println(Arrays.toString(a));
    }


}
