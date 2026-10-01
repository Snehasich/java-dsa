package Basic.maths;

public class lcm {
    public static void main(String[] args) {
        int n1 = 4, n2 = 6;

        System.out.println(LCM(n1, n2));
    }

    static int LCM(int n1, int n2) {
        return n1 * n2 / gcd(n1, n2);
    }

    static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
