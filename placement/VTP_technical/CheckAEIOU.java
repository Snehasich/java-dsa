package VTP_technical;

import java.util.*;

public class CheckAEIOU {
    public static void main(String[] args) {
        char[] arr = {'S','N','E','H','A','S','I','C','H'};

        int count = 0;

        for(int i=0; i<arr.length-1; i++) {
            if('A' == arr[i] || 'E' == arr[i] || 'I' == arr[i] || 'O' == arr[i] || 'U' == arr[i]) {
                System.out.print(arr[i]);
                count++;
            }
        }

        System.out.println();
        System.out.println("Total Using char : " + count);


        String name = "snehasich";
        int c = 0;
        for(int i=0; i<name.length(); i++) {
            if('a' == name.charAt(i) || 'e' == name.charAt(i) || 'i' == name.charAt(i) ||
                    'o' == name.charAt(i) || 'u' == name.charAt(i)) {
                c++;
            }
        }

        System.out.println("Using String : " + (name.length()-c));





        // count the no of character in the string without spaces
        String s = "Hi you are me are this are not";
        int counts = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') { // ignore spaces
                counts++;
            }
        }

        System.out.println("Number of characters (excluding spaces): " + counts);


        // count the no of "WORDS" in a sesntence
        String sp = " Hi you are me are this are not ";
        System.out.println("Number of words (including spaces): " + sp.split(" ").length);
        System.out.println("Number of words (excluding spaces): " + sp.split("[ ]+").length);
        System.out.println("Number of words (there can be any space): " + sp.split("[ ]*").length);
        System.out.println("Number of words (there will be min 3 spaces): " + sp.split("[ ]{3}").length);
        System.out.println("Number of words (trim at first and last): " + sp.trim().split("[ ]+").length);



        // you have a list of String, remove duplicates from list
        String[] listS = {"Snehasich", "Samal", "Snehasich", "Samal", "Snehasich", "Suhas", "Shivam"};
        System.out.println(Arrays.toString(listS));
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < listS.length; i++) {
            if (!newList.contains(listS[i])) {
                newList.add(listS[i]);
            }
        }
        System.out.println("Using List : " + newList);

        // using normal for loop
//        for(int i=0; i<arr.length; i++) {
//            for(int j=i+1; j<arr.length; j++) {
//                if(listS[i].equals(listS[j])) {
//                    listS[j] = null;
//                }
//            }
//            System.out.println("Using normal for loops : " + Arrays.toString(listS));
//        }  // error Comes becauase we have to use initialize the value

        // using hashSet
        Set<String> haha = new HashSet<String>();
        for(int i=0; i<listS.length; i++) {
            haha.add(listS[i]);
        }
        System.out.println("Using HashSet : " + haha);
    }
}
