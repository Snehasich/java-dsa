package easy;
//Input_: n = 12
//Output: "1100"
//Explanation: the binary representation of 12 is "1100", since 12 = 1×23 + 1×22 + 0×21+ 0×20 = 12_
//Input_: n = 33
//Output: "100001"
//Explanation: the binary representation of 33 is "100001", since 1×25 + 0×24 + 0×23 + 0×22 + 0×21 + 1×20 = 33_

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 12;

        System.out.println(DecToBin(n));
    }

    static String DecToBin(int n) {

        if(n == 0) return "0";

        String ans = "";

        while(n > 0) {
            ans = (n % 2) + ans;         // 0, 00, 100, 1100
            n /= 2;                     // 12, 6, 3, 1
        }

        return ans;
    }
}
