package strings.Pattern;

// First pattern
//*
//* *
//* * *
//* * * *

//Second pattern
//* * * *
//* * * *
//* * * *
//* * * *

//Third pattern
//* * * *
//* * *
//* *
//*

public class firstPattern {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("First pattern");
        pattern1(n);
        System.out.println("\nSecond pattern");
        pattern2(n);
        System.out.println("\nThird pattern");
        pattern3(n);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newLine
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
//        for (int row = n; row >= 1; row--) {
//            // for every row, run the col
//            for(int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            // when one row is printed, we need to add a newLine
//            System.out.println();
//        }
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for(int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newLine
            System.out.println();
        }
    }
}
