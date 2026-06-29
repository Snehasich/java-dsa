package VTP_technical;

public class Prime {
    public static void main(String[] args) {
        int n = 1566;

        System.out.println(prime(n));

        System.out.println("Prime Range from 0 to n : ");
        for (int i = 2; i * i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean prime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
