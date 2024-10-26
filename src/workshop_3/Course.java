package workshop_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// STEP 1.2: Define a class named Course with the next properties
public class Course implements ICourse {

    // Property one (code)
    public String code;

    // Property one (name)
    public String name;

    // Property one (students list)
    public List<Student> students;

    public Course(String code, String name, List<Student> students) {
        this.code = code;
        this.name = name;
        this.students = students;
    }

    // STEP 3.1: Method to find a student by name
    public List<Student> findStudentsByName(String name) {
        List<Student> studentsFound = new ArrayList<>();
        for (Student student : students) {
            if (name.equals(student.name.toLowerCase())) {
                studentsFound.add(student);
            }
        }

        if (studentsFound.isEmpty()) {
            System.out.println("Student not found");
        }

        return studentsFound;
    }

    // STEP 3.2: Method to delete a student by license plate
    public void deleteStudent(String licensePlate) {
        Student studentFound = null;

        for (Student student : students) {
            if (licensePlate.equals(student.licensePlate.toLowerCase())) {
                studentFound = student;
                students.remove(student);
                break;
            }
        }

        if (studentFound == null) {
            System.out.println("Student not found");
        } else {
            System.out.println("Student deleted successfully: " + studentFound);

        }
    }

    // STEP 3.3: Method to update a student
    public Student updateStudent(String newName, int newAge, String licensePlate) {
        Student studentFound = null;

        for (Student student : students) {
            if (licensePlate.equals(student.licensePlate.toLowerCase())) {
                studentFound = student;
                break;
            }
        }

        if (studentFound != null) {
            studentFound.setName(newName);
            studentFound.setAge(newAge);
            // studentFound.setLicensePlate(newLicensePlate); | As we imagined that license plate was a unique field, we will not update it.
        } else {
            System.out.println("Student not found");
        }

        // students.add(studentFound);
        System.out.println("Student updated successfully");
        return studentFound;
    }

    // STEP 4: Students sorting by name
    public List<Student> sortingStudentsByName() {
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Students ordered correctly");
        return students;
    }
}
