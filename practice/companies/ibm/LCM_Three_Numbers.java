package companies.ibm;

public class LCM_Three_Numbers {
    public static void main(String[] args) {
        // 4 6 8 → 24
        System.out.println(lcm(lcm(4, 6), 8));
    }

    static int lcm(int a, int b) {

        return (a * b) / hcf(a, b);
    }

    static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
