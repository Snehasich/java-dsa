package companies.infrrd.Logic_Problems;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = true;

        if(n < 2) {
            isPrime = false;
        }

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}
