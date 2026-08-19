package companies.infrrd.Search_Sort;

// ============================================================
// JAVA SEARCHING & SORTING - INTERVIEW PRACTICE
// ============================================================
//
// 1. Linear Search
// 2. Binary Search
// 3. Bubble Sort
// 4. Selection Sort
// 5. Insertion Sort
//
// ============================================================


import java.util.Arrays;

public class SearchingSorting {

    public static void main(String[] args) {

        // ====================================================
        // 1. LINEAR SEARCH
        // ====================================================
        // Check elements one by one.
        // Works even if the array is NOT sorted.
        // Time Complexity: O(n)

        int[] arr1 = {10, 20, 30, 40, 50};

        int target = 30;

        for (int i = 0; i < arr1.length; i++) {

            // Check if current element is target
            if (arr1[i] == target) {

                System.out.println("Linear Search:");
                System.out.println("Found at index: " + i);

                break;
            }
        }


        // ====================================================
        // 2. BINARY SEARCH
        // ====================================================
        // IMPORTANT: Array MUST be sorted.
        // Check the middle element.
        // If target is bigger -> search right.
        // If target is smaller -> search left.
        // Time Complexity: O(log n)

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};

        target = 60;

        int left = 0;
        int right = arr2.length - 1;

        while (left <= right) {

            // Find middle index
            int mid = left + (right - left) / 2;

            // Target found
            if (arr2[mid] == target) {

                System.out.println("\nBinary Search:");
                System.out.println("Found at index: " + mid);

                break;
            }

            // Target is bigger
            // Search right side
            if (arr2[mid] < target) {

                left = mid + 1;

            } else {

                // Target is smaller
                // Search left side
                right = mid - 1;
            }
        }


        // ====================================================
        // 3. BUBBLE SORT
        // ====================================================
        // Compare neighboring elements.
        // Swap if they are in the wrong order.
        // Largest element moves to the end.
        // Time Complexity: O(n²)

        int[] arr3 = {5, 3, 2, 4};

        for (int i = 0; i < arr3.length - 1; i++) {

            // Compare adjacent elements
            for (int j = 0; j < arr3.length - 1 - i; j++) {

                // If left is bigger than right
                if (arr3[j] > arr3[j + 1]) {

                    // Swap
                    int temp = arr3[j];

                    arr3[j] = arr3[j + 1];

                    arr3[j + 1] = temp;
                }
            }
        }

        System.out.println("\nBubble Sort:");
        System.out.println(Arrays.toString(arr3));


        // ====================================================
        // 4. SELECTION SORT
        // ====================================================
        // Find the smallest element.
        // Put it at the current position.
        // Repeat for the remaining elements.
        // Time Complexity: O(n²)

        int[] arr4 = {5, 3, 4, 1};

        for (int i = 0; i < arr4.length - 1; i++) {

            // Assume current element is minimum
            int minIndex = i;

            // Find smaller element
            for (int j = i + 1; j < arr4.length; j++) {

                if (arr4[j] < arr4[minIndex]) {

                    // Store index of smallest element
                    minIndex = j;
                }
            }

            // Swap current element
            // with minimum element
            int temp = arr4[i];

            arr4[i] = arr4[minIndex];

            arr4[minIndex] = temp;
        }

        System.out.println("\nSelection Sort:");
        System.out.println(Arrays.toString(arr4));


        // ====================================================
        // 5. INSERTION SORT
        // ====================================================
        // Take one element.
        // Find its correct position.
        // Move bigger elements to the right.
        // Insert the element.
        // Time Complexity: O(n²)

        int[] arr5 = {5, 3, 4, 1};

        // Start from index 1
        // Index 0 is considered sorted
        for (int i = 1; i < arr5.length; i++) {

            // Store current element
            int key = arr5[i];

            // Start from previous element
            int j = i - 1;

            // Move bigger elements to the right
            while (j >= 0 && arr5[j] > key) {

                arr5[j + 1] = arr5[j];

                j--;
            }

            // Insert key at correct position
            arr5[j + 1] = key;
        }

        System.out.println("\nInsertion Sort:");
        System.out.println(Arrays.toString(arr5));
    }
}