package Basic.recursion;

public class Check_No_Prime {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(checkPrime(n));
    }

    static boolean checkPrime(int num) {
        if(num < 2) return false;

        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) {  // when the number is divisible by another number.
                return false;
            }
        }

        return true;
    }
}
