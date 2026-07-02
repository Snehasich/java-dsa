package VTP_technical.Day4;

import java.util.*;

public class SortingCustomList {
    public static void main(String[] args) {
        ArrayList<Student> listOfStudents = new ArrayList<Student>();

        listOfStudents.add(new Student(4,"Snehasich"));
        listOfStudents.add(new Student(9,"Suhas"));
        listOfStudents.add(new Student(6,"Shivam"));
        listOfStudents.add(new Student(8,"Sumedh"));



        for (Student student : listOfStudents) {
            student.printStudents();
        }
//        Collections.sort(listOfStudents);   get compile time error here
        Collections.sort(listOfStudents, new StudentIDSorter());
        System.out.println();

        for (Student student : listOfStudents) {
            student.printStudents();
        }
    }
}


class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void printStudents() {
        System.out.println("Name : " + this.name + " | USN : " + this.id);
    }
}


class StudentIDSorter implements Comparator<Student> {
    public int compare(Student st1, Student st2) {
        if(st1.id == st2.id){
            return 0;
        } else if (st1.id < st2.id) {
            return 1;
        } else  {
            return -1;
        }
    }
}

class StudentNameSorter implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        return st1.name.compareTo(st2.name); // Ascending
//        return -st1.name.compareTo(st2.name); // Descending
    }
}
