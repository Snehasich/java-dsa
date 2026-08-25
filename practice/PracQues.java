import java.util.Arrays;

public class PracQues {

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50};

        System.out.println("Answer = " + check(arr));
    }

    static int check(int[] arr) {

        int max = 0;

        // Find maximum element
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int sum = 0;

        // Find sum of elements except maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                sum += arr[i];
            }
        }

        // Difference between sum and maximum
        int sub = Math.abs(max - sum);

        System.out.println("Sub = " + sub);

        // Remove the element equal to sub
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sub) {
                arr[i] = 0;
                break;
            }
        }

        System.out.println("Array = " + Arrays.toString(arr));

        // Recursion
        if (sub != 0) {
            return check(arr);
        }

        // sub is 0, so return 0
        return sub;
    }
}