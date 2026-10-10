package Basic.recursion;

//Example 1:
//Input : num = 529
//Output : 7
//Explanation : In first iteration the digits sum will be = 5 + 2 + 9 => 16
//In second iteration the digits sum will be 1 + 6 => 7.
//Now single digit is remaining , so we return it.


public class Sum_Of_Digits_Given_No {
    public static void main(String[] args) {
        int n = 529;

        System.out.println(addDigits(n));
    }

    static int addDigits(int num) {
        while(num >= 10) {              // till num becomes single digit split and add it there
            num = splitAndAdd(num);
        }

        return num;
    }

    static int splitAndAdd(int num) {
        int sum = 0;

        while(num != 0) {
            int digits = num % 10;

            sum += digits;

            num /= 10;
        }

        return sum;
    }


    // RECURSION


    //    public int addDigits(int num) {
    //        // Base case: only one digit remains
    //        if (num < 10) {
    //            return num;
    //        }
    //
    //        // Add the digits and repeat recursively
    //        return addDigits(splitAndAdd(num));
    //    }
    //
    //    static int splitAndAdd(int num) {
    //        // Base case
    //        if (num == 0) {
    //            return 0;
    //        }
    //
    //        // Last digit + sum of remaining digits
    //        return (num % 10) + splitAndAdd(num / 10);
    //    }
}
