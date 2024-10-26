import workshop_3.Course;
import workshop_3.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        // STEP 2.2: Create some students and add to students list | Imagine that license plate is a unique value
        Student studentOne = new Student("Samuel", 19, "2024");
        Student studentTwo = new Student("Samuel", 17, "2023");
        Student studentThree = new Student("Cristian", 17, "2022");

        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);

        // STEP 2.1: Create a course with code and name.
        Course course = new Course("code", "software construction", students);

        // STEP 5: execute the project

        label:
        while (true) {
            System.out.println("                             ");
            System.out.println("========= MAIN MENU =========");
            System.out.println("1) Find students by name");
            System.out.println("2) Delete student");
            System.out.println("3) Update student");
            System.out.println("4) Sort students by name");
            System.out.println("5) Exit");
            System.out.println("===========================");
            System.out.print("Choose: ");
            String option = sc.nextLine();

            switch (option) {
                case "5":
                    System.out.println("                ");
                    System.out.println("Come back soon");
                    break label;
                case "1":
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.println(course.findStudentsByName(name));
                    break;
                case "2":
                    System.out.print("License plate: ");
                    String licensePlate = sc.nextLine();
                    course.deleteStudent(licensePlate);
                    break;
                case "3":
                    System.out.print("License plate to search student to update: ");
                    String licensePlateToSearch = sc.nextLine();
                    System.out.print("New name: ");
                    String newName = sc.nextLine();
                    System.out.print("New age: ");
                    int newAge = Integer.parseInt(sc.nextLine());
                    System.out.println(course.updateStudent(newName, newAge, licensePlateToSearch));
                    break;
                case "4":
                    System.out.println(course.sortingStudentsByName());
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}