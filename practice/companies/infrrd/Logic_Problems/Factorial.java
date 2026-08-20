package companies.infrrd.Logic_Problems;

public class Factorial {
    public static void main(String[] args) {
        int number = 4;

        System.out.println(fact(number));;
    }

    static int fact(int n) {
        if(n <= 2) return n;

        return n * fact(n - 1);
    }


    //  int n = 5;
    //  int fact = 1;
    //
    //  for (int i = 1; i <= n; i++) {
    //
    //      fact = fact * i;
    //  }
    //
    //  System.out.println(fact);

}
