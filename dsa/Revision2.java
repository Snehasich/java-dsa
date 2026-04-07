package DSA_PRAC;

// Mini-Project #4 (Month-End Challenge)
// Task: Build a Student Marks Analyzer in Java
// Input n students’ names & marks
// Calculate average, highest, lowest, grade distribution
// Use arrays, loops, functions
// Goal: Consolidate all Month-1 skills.

import java.util.Arrays;

public class Revision2 {
    public static void main(String[] args) {

        int[] arr = {2,10,20,18,13,19};

        System.out.println(Arrays.toString(arr));

        System.out.println("Average of students marks : " + avg(arr));
        System.out.println("Highest of students marks : " + highest(arr));
        System.out.println("Lowest of students marks : " + lowest(arr));
        System.out.println("Grade of students marks : ");
        grade(arr);

    }

    static double avg(int[] arr) {
        double avg=0;
        int n = arr.length;

        for(double i : arr) {
            avg += i / n;
        }

        return avg;
    }

    static double highest(int[] arr) {
        double max = arr[0];

        for(double i : arr) {
            if(max < i) {
                max = i;
            }
        }

        return max;
    }

    static double lowest(int[] arr) {
        double min = arr[0];

        for(double i : arr) {
            if(min > i) {
                min = i;
            }
        }

        return min;
    }

    static void grade(int[] arr) {

        String g="";

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 20) {
                g = "A+";
                System.out.println(arr[i] + " -> " + g);
            } else if(arr[i] < 20 && arr[i] >= 15) {
                g = "A";
                System.out.println(arr[i] + " -> " + g);
            } else if(arr[i] < 15 && arr[i] >= 10) {
                g = "B";
                System.out.println(arr[i] + " -> " + g);
            } else if(arr[i] < 10 && arr[i] >= 5) {
                g = "C";
                System.out.println(arr[i] + " -> " + g);
            } else if(arr[i] < 5 && arr[i] >= 0) {
                g = "F";
                System.out.println(arr[i] + " -> " + g);
            } else {
                System.out.println("Invalid/Error");
            }
        }
    }
}
