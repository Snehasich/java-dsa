package strings.Pattern;

// Fourth pattern
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//Fifth pattern
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

public class SecondPattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fourth pattern");
        pattern4(n);
        System.out.println("Fifth pattern");
        pattern5(n);
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
//        for (int i = 1; i <= 2 * n; i++) {
//            if(i <= n) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                for (int j = 1; j <= 2*n-i; j++) {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }

        for(int i=1; i<=2 * n; i++) {
            int totalColsInRow = i > n ? 2 * n - i : i;
            for(int j=1; j<= totalColsInRow; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
