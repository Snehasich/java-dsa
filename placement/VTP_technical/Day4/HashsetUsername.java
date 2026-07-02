package VTP_technical.Day4;

// List of String that are usernames
//  - You have to maintain a structure where all the username are unique
//  - if user tries to add a username it should give already exists
//  - else it should add

import java.util.HashSet;
import java.util.Scanner;

public class HashsetUsername {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Snehasich");
        hashSet.add("Shivam");
        hashSet.add("Sumedh");
        hashSet.add("Suhas");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (hashSet.contains(username)) {
            System.out.println("Username already exists.");
        } else {
            hashSet.add(username);
            System.out.println("Username added successfully.");
        }

        System.out.println(hashSet);
    }
}