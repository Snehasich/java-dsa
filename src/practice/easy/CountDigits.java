package practice.easy;

// Count number of digits in a number

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        count(num);
    }

    static void count(int num) {

//        String s = String.valueOf(num);
//        System.out.println(s.length());

        int c = 0;

        if(num > 0) {
            do {
                num /= 10;
                c++;
            }while(num > 0);

            System.out.println("no of digits is : " + c);
        } else {
            System.out.println("Enter a positive value");
        }
    }
}
