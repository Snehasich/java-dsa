package strings.Pattern;

//Nine pattern
//2 2 2 2 2 3
//2 1 1 1 2 3
//2 1 0 1 2 3
//2 1 1 1 2 3
//2 2 2 2 2 3
//3 3 3 3 3 3

public class FifthPattern {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Nine pattern");
        pattern9(n);;
    }

    private static void pattern9(int n) {
        int original = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = original - Math.min(Math.min(row,col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }


}
