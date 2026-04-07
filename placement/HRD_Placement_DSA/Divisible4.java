package HRD_Placement_DSA;

// Input : n = 1124
// Output : Yes
// Input : n = 1234567589333862
// Output : No
// Input : n = 363588395960667043875487
// Output : No

import java.math.BigInteger;

public class Divisible4 {
    public static void main(String[] args) {
//        long n = 363588395960667043875487l;
//        System.out.println(divisible(n));

        String s = "363588395960667043875487";
        System.out.println(stringCheck(s));
    }

    static boolean divisible(long n) {

        boolean b = false;

        if(n % 4 == 0) {
            return true;
        }

        return b;
    }


    static boolean stringCheck(String s) {

        String[] stt = s.split("");


        String str = "";

        for(int i=5; i>=0; i++) {
            str += stt[i];
        }

        System.out.println(str);

        return false;
    }

}
