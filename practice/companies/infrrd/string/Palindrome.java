package companies.infrrd.string;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";

        palin(str);
    }

    static void palin(String s) {
        // reverse
        String rev = "";
        for(int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        // check for palin
        boolean palin = false;
        for(int i = 0; i < s.length(); i++) {
            if(rev.charAt(i) == s.charAt(i)){
                palin = true;
            } else {
                break;
            }
        }

        if(palin){
            System.out.println("palin");
        } else {
            System.out.println("not palin");
        }
    }
}
