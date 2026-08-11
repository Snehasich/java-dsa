package strings.Pattern;

// Sixth pattern
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
//
//Seventh pattern
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5

public class ThirdPattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sixth pattern");
        pattern6(n);
        System.out.println("Seventh pattern");
        pattern7(n);
    }


    private static void pattern6(int n) {
//        // Upper half
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        // Lower half
//        for (int i = n - 1; i >= 1; i--) {
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        for(int i=1; i<=2 * n; i++) {
            int totalColsInRow = i > n ? 2 * n - i : i;

            int noOfSpace = n - totalColsInRow;
            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }

            for(int j=1; j<= totalColsInRow; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            
            //spaces
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
