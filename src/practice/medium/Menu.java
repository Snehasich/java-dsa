package practice.medium;

// menu -> insert, delete, search, display, quit

import java.util.*;

public class Menu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter array size(n):");
        int n = in.nextInt();

        System.out.println("enter array elements:");
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(in.nextInt());
        }

        menu(arr);
    }

    static void menu(ArrayList arr) {

        Scanner sc = new Scanner(System.in);

        int ch = 0;

        do {
            System.out.println("");
            System.out.println("-".repeat(50));
            System.out.println("Menu");
            System.out.println("-".repeat(50));
            System.out.println("1. insert");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. display");
            System.out.println("5. quit");

            System.out.println();
            System.out.println("Enter no in this : ");
            ch = sc.nextInt();

            switch(ch) {
                case 1 :
                    System.out.print("Enter the element to insert : ");
                    int adds = sc.nextInt();
                    arr.add(adds);
                    System.out.println("inserted element");
                    break;
                case 2 :
                    System.out.println("Enter the element to delete : ");
                    int del = sc.nextInt();
                    if(arr.contains(del)) {
                        arr.remove(arr.indexOf(del));
                    } else {
                        System.out.println("Not contain element");
                    }
                    System.out.println("deleted element");
                    break;
                case 3 :
                    System.out.println("Enter the target element : ");
                    int target = sc.nextInt();
                    searching(arr,target);
                    System.out.println();
                    break;
                case 4 :
                    System.out.println("Displaying elements : ");
                    System.out.println(arr.toString());
                    break;
                case 5 :
                    System.exit(0);
                default :
                    System.out.println("Invalid option");
                    break;
            }

        } while(ch != 5);

    }

    static void searching(ArrayList arr, int target) {

        boolean found = false;

        for(int i=0; i<arr.size(); i++) {
            if(arr.contains(target)) {
                found = true;
            } else {
                found = false;
            }
        }

        if(found) {
            System.out.println("target found");
        } else {
            System.out.println("target not found");
        }
    }

}
