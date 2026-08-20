package companies.infrrd.Logic_Problems;

// LCM = Least Common Multiple

public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        System.out.println(lcm(a,b));
    }

    static int gcd(int a,int b){
        // Euclidean algorithm.
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int lcm(int a,int b){
        return (a * b) / gcd(a,b);
    }
}
