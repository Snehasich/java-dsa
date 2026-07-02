package VTP_technical.Day4;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(1);
        a.add(-121);
        a.add(13);
        a.add(232);
        a.add(34);

        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.contains(121));
        System.out.println(a.remove(34));


        for (Integer lang : a) {
            System.out.println(lang);
        }

    }
}
