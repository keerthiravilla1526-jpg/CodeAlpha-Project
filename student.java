import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    static class StudentData {
        String name;
        int marks;

        StudentData(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<StudentData> students = new ArrayList<>();

        System.out.println("======================================");
        System.out.println("       STUDENT GRADE TRACKER");
        System.out.println("======================================");

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            int marks;

            while (true) {
                System.out.print("Enter Marks (0-100): ");
                marks = sc.nextInt();
                sc.nextLine();

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid Marks! Please enter between 0 and 100.");
                }
            }

            students.add(new StudentData(name, marks));
        }

        double total = 0;
        int highest = students.get(0).marks;
        int lowest = students.get(0).marks;

        String topper = students.get(0).name;
        String lowestStudent = students.get(0).name;

        for (StudentData s : students) {
            total += s.marks;

            if (s.marks > highest) {
                highest = s.marks;
                topper = s.name;
            }

            if (s.marks < lowest) {
                lowest = s.marks;
                lowestStudent = s.name;
            }
        }

        double average = total / n;

        System.out.println("\n==============================================");
        System.out.println("             STUDENT REPORT");
        System.out.println("==============================================");
        System.out.printf("%-20s %-10s %-10s%n", "Name", "Marks", "Grade");
        System.out.println("----------------------------------------------");

        for (StudentData s : students) {
            System.out.printf("%-20s %-10d %-10s%n",
                    s.name,
                    s.marks,
                    getGrade(s.marks));
        }

        System.out.println("----------------------------------------------");
        System.out.printf("Average Marks : %.2f%n", average);
        System.out.println("Highest Marks : " + highest + " (" + topper + ")");
        System.out.println("Lowest Marks  : " + lowest + " (" + lowestStudent + ")");
        System.out.println("==============================================");

        sc.close();
    }

    public static String getGrade(int marks) {
        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }
}