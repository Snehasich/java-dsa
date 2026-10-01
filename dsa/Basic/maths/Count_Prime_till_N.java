package Basic.maths;

public class Count_Prime_till_N {
    public static void main(String[] args) {
        System.out.println(primeUptoN(6));
    }

    static int primeUptoN(int n) {
        int count = 0;

        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
