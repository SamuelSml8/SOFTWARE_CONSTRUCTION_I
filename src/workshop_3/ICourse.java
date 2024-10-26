package workshop_3;

import java.util.List;

public interface ICourse {

    // Method to found students by name
    List<Student> findStudentsByName(String name);

    // Method to delete a student by license plate
    void deleteStudent(String licensePlate);

    // Method to update a student information
    Student updateStudent(String newName, int newAge, String licensePlate);

    // Method to sort students list
    List<Student> sortingStudentsByName();
}
