import java.util.Arrays;
import java.util.List;
import java.util.Stack;


class ListNode {
    int data;
    ListNode next;

    ListNode() {}
    ListNode(int data) { this.data = data; }
    ListNode(int data, ListNode next) { this.data = data; this.next = next; }
}


public class Revision {
    public static void main(String[] args) {
        // 1   (print sum without arithmetic operators)
        System.out.println(Integer.sum(1,2));
        System.out.println(Math.addExact(1,2));

        // 2  (digit add)
        int a = 123;
        int sum = 0;

        while(a > 0) {
            int digit = a % 10;     // 3,2, 1
            sum += digit;           // sum = 3+2=5, 5+1 = 6
            a /= 10;                // a = 12, 1, 0
        }

        System.out.println(sum);


        // 3    (largest of 3 no)
        System.out.println(Math.max(2, Math.max(3,10)));


        // 4    (prime number)
        int n = 1;
        boolean isPrime = true;

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(n <= 1) {
            isPrime = false;
        }

        System.out.println("Do " + n + " it is prime : " + isPrime);


        // 5    (factorial)


        // 6  secondLargest
        int[] arr = {10,10,5};
        secondLargest(arr);


        // 7  Valid palindrome (leetcode 125)
        String s = "A man, a plan, a canal: Panama";
        validPalindrome(s);


        // 8  String Pattern
        //    *
        //   ***
        //  *****
        // *******
        //*********
        // *******
        //  *****
        //   ***
        //    *
        stringPattern(5);


        // 9  String Pattern2
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        stringPattern2(5);


        // 10  Linear
        System.out.println("\n");
        int[] lin = {1,3,5,6};
        System.out.println("Linear : " + linear(lin,2));


        // 11  Binary search
        int[] bin = {1,3,5,6};
        System.out.println("Binary : " + binary(bin,4));


        // 12  LeetCode 11. Container With Most Water   (two pointer)
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(Container(height));


        // 13  LeetCode 643. Maximum Average Subarray I
        int[] subarray = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("Max Average is : " + findMaxAverage(subarray, k));


        // 14  Bubble Sort
        int[] bub = {5,3,4,1,2};
        System.out.println("Bubble Sort : " + bubble(bub));


        // 15  Selection Sort
        int[] sel = {5,3,4,1,2};
        System.out.println("Selection Sort : " + selection(sel));


        // 15  Insertion Sort
        int[] ins = {5,3,4,1,2};
        System.out.println("Insertion Sort : " + insertion(ins));



        // 16  Leetcode 206, Reverse linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // reverse
        System.out.println("\nRevered : ");
        head = reverseList(head);
        ListNode temp2 = head;
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        }


        // 17  Search an element in a Linked List
        System.out.print("\nSearch : ");
        ListNode search = head;
        while(search != null) {
            System.out.print(search.data + " ");
            search = search.next;
        }
        int target = 3;
        System.out.println("Target : " + target + ", do it have : " + search(head, target));



        // 18  Leetcode 20. Valid Parentheses
        System.out.println("Stack : ");
        String str = "()[]{}";
        System.out.print(isValid(str));

    }


    static void secondLargest(int[] arr) {

        int max=0;
        int secondMax=-1;

        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("max : " + max);

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < max && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second max : " + secondMax);
    }

    static void validPalindrome(String s) {

        boolean isPalin = false;

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]" , "");

        System.out.println(s);

        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i) == s.charAt(s.length() - i - 1)) {
                isPalin = true;
            }
        }

        System.out.println(isPalin);
    }

    static void stringPattern(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for(int j=n; j>=i; j--) {
                System.out.print(" ");
            }

            // add
            for(int j=1; j<=(2*i)+1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n-2; i>=0; i--) {
            // opposite of above one

            // space
            for(int j=i; j<=n; j++) {
                System.out.print(" ");
            }
            // add
            for(int j=(2*i)+1; j>=1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    static void stringPattern2(int n) {
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i % 2 == 0) {
                    if(j % 2 == 0) {
                        System.out.print(0);
                    } else {
                        System.out.print(1);
                    }
                } else {
                    if(j % 3 == 0) {
                        System.out.print(0);
                    } else {
                        System.out.print(1);
                    }
                }


            }
            System.out.println();
        }

    }

    static int linear(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(target <= arr[i]) {
                return i;
            }
        }
        return arr.length;
    }

    static int binary(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = end + (start - end) / 2;

            if(target == arr[mid]) {
                return mid;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;            // >=
            }
        }

        return start;
    }

    static int Container(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        int max = 0;

        while(left < right) {
            int width = right - left;
            int minheight = Math.min(arr[left], arr[right]);
            int area = width * minheight;

            max = Math.max(max, area);

            if(arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }

        }


        return max;
    }

    static double findMaxAverage(int[] arr, int k) {
        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];              // sum = 2
        }

        int maxSum = sum;               // max = 2

        // Sliding window
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];             // sum = 2+50-1 = 51, 51+3-12 = 42,  last index done
            maxSum = Math.max(maxSum, sum);         // max = (2,51) = 51, (42,51) = 51
        }

        return (double) maxSum / k;                 // 51 / 4 = 12.75
    }

    static String bubble(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        return Arrays.toString(arr);
    }

    static String selection(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int min = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return Arrays.toString(arr);
    }

    static String insertion(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }

        return Arrays.toString(arr);
    }

    static ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, next;
        while(curr != null) {
            // save next node
            next = curr.next;

            // reverse link
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    static boolean search(ListNode data, int target) {
        ListNode temp = data;
        while(temp != null) {
            if(temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if(c == ')' && open != '(') return false;
                if(c == ']' && open != '[') return false;
                if(c == '}' && open != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}