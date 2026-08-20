package companies.infrrd.Logic_Problems;

public class CountDigits {
    public static void main(String[] args) {
        int number = 12345;

        count(number);
    }

    static void count(int num) {
        int c = 0;

        while(num > 0) {
            num /= 10;          // removes last digit
            c++;
        }

        System.out.println(c);
    }
}
