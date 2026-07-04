    package VTP_technical.Day6;

import java.util.TreeMap;

public class TreeMapEg {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(1,2);
        treeMap.put(2,3);
        treeMap.put(3,4);
        treeMap.put(4,5);
        treeMap.put(5,6);

        System.out.println(treeMap.get(2));
    }
}
