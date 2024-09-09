package workshop_2;

import java.util.Scanner;
import java.util.Vector;

public class GradeAverage {
    Vector<Float> grades = new Vector<>();
    int quantityGrades;
    Scanner sc = new Scanner(System.in);

    public GradeAverage() {
        System.out.println("Número de calificaciones: ");
        quantityGrades = Integer.parseInt(sc.nextLine());

        for (int s = 1; s <= quantityGrades; s++) {
            System.out.println("Nota N°" + s + ": ");
            grades.add(Float.parseFloat(sc.nextLine()));
        }
    }

    public float average() {
        float sum = 0;
        for (float grade : grades) {
            sum += grade;
        }

        return sum / quantityGrades;
    }

    public String status() {
        boolean status;
        float average = this.average();
        status = average >= 60;

        return "Promedio: " + average + "\nEstado: " + status;
    }
}
