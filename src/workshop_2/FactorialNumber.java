package workshop_2;

import java.util.Scanner;

public class FactorialNumber {

    Scanner sc = new Scanner(System.in);
    int factorial = 1;

    public FactorialNumber() {
        System.out.println("\nCALCULAR FACTORIAL");
        System.out.print("Número: ");
        int number = Integer.parseInt(sc.nextLine());

        for (int s = number; s >= 1; s--) {
            factorial *= s;
        }

        System.out.println("Resultado: " + factorial);
    }
}
