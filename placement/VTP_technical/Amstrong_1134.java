package VTP_technical;

// An Armstrong number (also called a Narcissistic number) is a number that is equal to the sum of its own digits,
// where each digit is raised to the power of the number of digits.
// eg : 370 (3 digits) 3^3 + 7^3 + 0^3 = 27+343+0=370

public class Amstrong_1134 {
    public static void main(String[] args) {
        int x = 153;

        System.out.println(countDigit(x));
        System.out.println(check(x));
        System.out.println(checkRange(100,500));
        System.out.println("EX : " + example(x));
    }

    static int countDigit(int x) {
        int count = 0;

        while(x != 0) {
            x /= 10;
            ++count;
        }

        return count;
    }

    static int check(int num) {
        int count = countDigit(num);
        int sum = 0;
        int originalNum = num;

        while(num != 0) {
            int lastDigit = num % 10;
            sum += (int) Math.pow(lastDigit, count);
            num/=10;
        }

        if(sum == originalNum) {
            return 1;
        }

        return 0;
    }

    static int checkRange(int x, int y) {
        int arms = 0;
        while(x != y) {
            if(check(x) == 1) {
                System.out.println(x);
                arms++;
            }
            x++;
        }

        return arms;
    }



    // example (prac)
    static int example(int x) {
        int count = 0;
        int newNum = x;
        int sum = 0;

        // count
        while(x != 0) {
            x /= 10;
            count++;
        }

        // check if equals originalNumber with sum
        x = newNum;
        while(x != 0) {
            int digit = x % 10;
            sum += (int) Math.pow(digit,count);
            x /= 10;
        }

        if(sum == newNum) return 1;

        return 0;
    }
}
