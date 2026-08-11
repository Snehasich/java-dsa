package strings.Pattern;

// Eight pattern
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5
//  4 3 2 1 2 3 4
//    3 2 1 2 3
//      2 1 2
//        1

public class FourthPattern {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Eight pattern");
        pattern8(n);;
    }

    private static void pattern8(int n){
            for (int row = 1; row <= 2 * n; row++) {

                int c = row > n ? 2 * n - row : row;

                //spaces
                for (int space = 0; space < n - c; space++) {
                    System.out.print("  ");
                }

                for (int col = c; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= c; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
    }
}
