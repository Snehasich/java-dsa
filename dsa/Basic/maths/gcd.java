package Basic.maths;

public class gcd {
    public static void main(String[] args) {
        int n1 = 4, n2 = 5;

        System.out.println(GCD(n1, n2));
    }

    static int GCD(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
