package VTP_technical.Day1;

public class SumOfRange {
    public static void main(String[] args) {
        int x = 89;
        int y = 7777;

        System.out.println(sumofrange(x,y));
    }

    static int sumofrange(int x, int y) {
//        int n = y - x + 1;
//        int formula = n / 2 * (x + y);

        // S = n / 2 * (a+l)
        // n = l - a + 1

        int n = y - x + 1;
        int formula = n * (x + y) / 2;

        return formula;
    }
}
