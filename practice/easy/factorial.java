package easy;

import java.util.*;

// Find factorial of a number

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println(fact(num));
    }

    static int fact(int n) {
        if(n <= 1) {
            return n;
        }
        return n * fact(n - 1);   // 3 * (3 - 1)  ,   3 * 2
    }
}
