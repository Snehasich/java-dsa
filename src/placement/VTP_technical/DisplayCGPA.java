package placement.VTP_technical;

// list of students
// need to dusplay the students in descending order of CGPA
// Stdent(name, age)

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void display() {
        System.out.println("Name : " + name + ", CGPA : " + cgpa);
    }
}

public class DisplayCGPA {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Abra", 8.9));
        students.add(new Student("Dabra", 8.0));
        students.add(new Student("Robin", 9.5));

        // sort by CGPA in descending order
        students.sort((a, b) -> Double.compare(b.getCgpa(), a.getCgpa()));

        // display
        for (Student s : students) {
            s.display();
        }
    }
}
