package dsa.recursion;// n = 41, k = 3
// output , 31

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(josephusProblem(41,3));
    }

    static int josephusProblem(int n, int k) {
        if(n == -1) {
            return 1;
        } else {
            return (josephusProblem(n-1, k) + k-1) % n + 1;
        }
    }
}
