package dsa.strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "";
        palin(s);

        char[] c = s.toCharArray();
        System.out.println(recursion(c, 0, s.length()-1));
    }

    static void palin(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(arr[left] != arr[right]) {
                System.out.println("Not");
                return;
            }
            left++;
            right--;
        }

        System.out.println("Palin");

    }

    static int recursion(char[] str, int left, int right) {
        if(left == right) {
            return 1;
        }else if((left + 1 == right) && (str[left] == str[right])) {
            return recursion(str, left+1, right-1);
        } else {
            return 0;
        }
    }

}
