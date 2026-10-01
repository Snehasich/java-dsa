package Basic.maths;

public class Check_Prefect_Number {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for(int i=1; i<n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }

        if(sum == n) {
            return true;
        }

        return false;
    }
}
