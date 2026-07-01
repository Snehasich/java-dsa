package VTP_technical.Day3;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        ArrayList list = new ArrayList();
        for(int i=0; i<5; i++)
            list.add(arr[i]);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
//        list.clear();
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1));


        ArrayList<Integer> generics = new ArrayList<>();
        generics.add(5);
        generics.add(2);
        generics.add(3);
        generics.add(9);
        System.out.println(generics);
        java.util.Collections.sort(generics);
        System.out.println(generics);


//        for (Integer i = 0; i < generics.size(); i++) {
//            System.out.println(i);
//            generics.add(99);
//        }                                INFINITE LOOP
    }
}
