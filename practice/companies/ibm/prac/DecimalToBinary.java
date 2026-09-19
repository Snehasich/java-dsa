package companies.ibm.prac;

public class DecimalToBinary {

    public static void main(String[] args) {
        // 10 → 1010

        System.out.println(toBinary(10));
    }

    static String toBinary(int n) {
        String bin = "";

        while(n > 0) {
            bin = (n % 2) + bin;
            n = n / 2;
        }

        return bin;
    }
}
