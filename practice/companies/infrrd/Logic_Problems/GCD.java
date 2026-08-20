package companies.infrrd.Logic_Problems;

// Greatest Common Divisor

// 12 and 18
//Factors of 12:
//1 2 3 4 6 12

//Factors of 18:
//1 2 3 6 9 18

//Greatest common = 6

public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        System.out.println(gcd(a,b));
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
}
