package linked_list;

public class newLL {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//
//        list.display();
//
//        LL list2 = new LL();
//        System.out.println();
//        list2.insertEnd(3);
//        list2.insertEnd(2);
//        list2.insertEnd(8);
//        list2.insertEnd(17);
//        list2.insertIndex(100,3);
//        list2.display();
//        System.out.println(list2.deleteFirst());
//        list2.display();
//        System.out.println(list2.deleteLast());
//        list2.display();
//        System.out.println(list2.deleteIndex(2));
//        list2.display();


//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.display();
//        list.displayRev();
//        list.insertEnd(100);
//        list.display();
//        list.insertIndex(8,500);
//        list.display();

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.delete(19);
//        list.display();



        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.display();

        System.out.println();

        list.recursionInsert(50, 2);

        list.display();

    }
}
