package VTP_technical.Day1;

public class Prime {
    public static void main(String[] args) {
        int n = 10000;

        System.out.println(prime(n));

        System.out.print("Prime Range from 0 to n : ");
        checkRange(n);
    }

    static boolean prime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void checkRange(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
