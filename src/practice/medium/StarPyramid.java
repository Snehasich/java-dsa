package practice.medium;

// Concept: Nested loops for pattern problems.
// Problem: Print Star Pyramid Pattern

//     *
//   * * *
// * * * * *

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of level : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            // spaces
            for(int j=n; j >= i+1; j--) {
                System.out.print(" ");
            }

            // * printing
//            for(int j=1; j<i+2; j++) {
//                System.out.print("*");
//            }
//            for(int j=0; j<i; j++) {
//                System.out.print("*");
//            }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }

            System.out.println();
        }


        // for (int i = 0; i < n; i++) {
        //
        //    // spaces
        //    for (int j = 0; j < n - i - 1; j++) {
        //        System.out.print(" ");
        //    }
        //
        //    // stars
        //    for (int j = 0; j < 2 * i + 1; j++) {
        //        System.out.print("*");
        //    }
        //
        //    System.out.println();
        //}

    }
}
