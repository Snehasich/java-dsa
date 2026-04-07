package dsa;// - - 1
// - 1 2 1
// 1 2 3 2 1

public class pattern {
    public static void main(String[] args) {
        int n = 10;

        for(int i=1; i<=n; i++) {
            for(int j=n-i; j>0; j--) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            for(int j=i-1; j>=1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

        }
    }

    public static class ShiPalin {
        public static void main(String[] args) {
            String s = "A";

            char[] arr = s.toCharArray();

            int left = 0;
            int right = s.length() - 1;

            while(left < right) {
                if(arr[left] != arr[right]) {
                    System.out.println("Not");
                    return;
                }
                left++;
                right--;
            }

            System.out.println("Palin");
        }
    }
}
