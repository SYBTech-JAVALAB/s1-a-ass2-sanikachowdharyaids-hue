import java.util.Scanner;

class Student {
    String name;
    int id;
    int marks;
    char grade;

    static int totalStudents = 0;
    final String courseName = "Java Programming";

    Student() {
        name = "NA";
        id = 0;
        marks = 0;
        grade = 'N';
        totalStudents++;
    }

    Student(String name, int id, int marks, char grade) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.grade = grade;
        totalStudents++;
    }

    void display() {
        System.out.println("Course: " + courseName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class Ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student id: ");
        int id = sc.nextInt();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);

        Student s2 = new Student(name, id, marks, grade);

        s1.display();
        s2.display();

        System.out.println("Total Students: " + Student.totalStudents);
    }
}