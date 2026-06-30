package VTP_technical.Day1;

import java.util.Scanner;

public class Avg {

    static int avg(int x, int y) {
        return x + (y - x) / 2;         // best for overflow
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();

        System.out.println("Average is : " + avg(x,y));
    }
}
