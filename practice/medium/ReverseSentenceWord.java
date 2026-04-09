package medium;

// Task: Write a program to take a sentence, reverse each word, and print it.

import java.util.*;

public class ReverseSentenceWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence : ");
        String sentence = sc.nextLine();


        input(sentence);
    }

    static void input(String sentence) {

        String[] s = sentence.split(" ");
        String strFinal = "";

        for(String str : s) {
            String rev = "";

            for(int j=str.length()-1; j >= 0; j--) {
                rev += str.charAt(j);
            }

            strFinal += rev + " ";
        }

//        for (int i = 0; i < s.length; i++) {
//            String rev = "";
//            String str = s[i];
//
//            for (int j = str.length() - 1; j >= 0; j--) {
//                rev += str.charAt(j);
//            }
//
//            strFinal += rev + " ";
//        }
//
//        System.out.println(strFinal.trim());


        System.out.println(strFinal);

    }
}
