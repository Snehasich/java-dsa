package companies.infrrd.Logic_Problems;

public class Armstrong {
    // 153 = 1³ + 5³ + 3³
    //     = 1 + 125 + 27
    //     = 153

    public static void main(String[] args) {
        int n = 153;

        System.out.println(armstrong(n));
    }

    static String armstrong(int n) {
        int sum = 0;
        int original = n;

        while(n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return sum == original ? "Armstrong" : "Not Armstrong";
    }
}
