package workshop_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    List<Float> grades = new ArrayList<>();

    int quantityGrades;
    Scanner sc = new Scanner(System.in);

    public Average() {
        System.out.println("Número de calificaciones: ");
        quantityGrades = Integer.parseInt(sc.nextLine());

        for (int s = 1; s <= quantityGrades; s++) {
            System.out.println("Nota N°" + s + ": ");
            grades.add(Float.parseFloat(sc.nextLine()));
        }
    }

    public float calculateAvg() {
        float sum = 0;
        for (Float grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }
}
