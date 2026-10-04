package Basic.strings;

//Example 1:
//Input: num = "52"
//Output: "5"
//Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

//Example 2:
//Input: num = "4206"
//Output: ""
//Explanation: There are no odd numbers in "4206".

//Example 3:
//Input: num = "35427"
//Output: "35427"
//Explanation: "35427" is already an odd number.



public class Largest_Odd_Number_String_1903 {
    public static void main(String[] args) {
        String num = "52";

        System.out.println(largestOddNumber(num));
    }


    // this get error for long values

//    static String largestOddNumber(String num) {
//        long max = Long.parseLong(num);
//        String ans = "";
//
//        for (int i = 0; i < num.length(); i++) {
//            if (max % 2 != 0) {
//                ans = String.valueOf(max);
//                return ans;
//            } else {
//                max = max / 10;
//            }
//        }
//
//        return ans;
//    }


    static String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >= 0; i--) {

            if((num.charAt(i) - '0') % 2 != 0) {       // converts the digit character into its numeric value.
                return num.substring(0, i + 1);
            }
        }

        return "";
    }



    // if starting will be 0 then -> 0214638

    //    public String largeOddNum(String s) {
    //
    //        int start = 0;
    //
    //        while (start < s.length() - 1 && s.charAt(start) == '0') {
    //            start++;
    //        }
    //
    //        for (int i = s.length() - 1; i >= start; i--) {
    //
    //            if ((s.charAt(i) - '0') % 2 != 0) {
    //                return s.substring(start, i + 1);
    //            }
    //        }
    //
    //        return "";
    //    }
}
