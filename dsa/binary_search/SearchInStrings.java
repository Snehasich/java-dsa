package binary_search;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Snehasich";
        char target = 'H';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name, target));
    }


    static boolean search2(String str, char target) {

        if(str.length() == 0) {
            return false;
        }
        for(char ele : str.toCharArray()) {
            if(ele == target) {
                return true;
            }
        }
        return false;
    }



    static boolean search(String str, char target) {

        if(str.length() == 0) {
            return false;
        }
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}

