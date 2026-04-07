package VTP_technical;

import java.util.TreeSet;

class SecondLargestNumber {
    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 1, 3};

        TreeSet<Integer> ts = new TreeSet<>();

        // Add elements to TreeSet
        for (int num : arr) {
            ts.add(num);
        }

        // Remove the largest element
        ts.pollLast();

        // Now the last element is the second largest
        System.out.println("Second Largest Number is: " + ts.last());
    }
}
