package companies.infrrd.Logic_Problems;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;

        reverse(number);
    }

    static void reverse(int num) {
        int rev = 0;

        while(num > 0) {
            int digit = num % 10;       // gets last digit
            rev = rev * 10 + digit;
            num /= 10;          // removes last digit
        }

        System.out.println(rev);
    }
}
