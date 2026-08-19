package companies.ibm;

public class HCF {
    public static void main(String[] args) {
        // 12, 18 → 6
        System.out.println(hcf(12, 18));
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
