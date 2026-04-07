public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");
        StringBuilder br = new StringBuilder();

        for(int i=str.length-1; i>=0; i--) {
            br.append(str[i]);

            if(i != 0) {
                br.append(" ");
            }

        }


        return br.toString();
    }
}
