package Basic.recursion;

public class Sum_First_N_Numbers {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(NnumbersSum(n));
    }

    static int NnumbersSum(int N) {
        if(N == 0) return N;

        return N += NnumbersSum(N - 1);
    }
}
