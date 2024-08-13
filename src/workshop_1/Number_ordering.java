package workshop_1;

import java.util.Scanner;

public class Number_ordering {
    Scanner sc = new Scanner(System.in);
    float n1, n2, n3;

    public Number_ordering() {
        System.out.println("Ingrese el número 1: ");
        n1 = Float.parseFloat(sc.nextLine());

        System.out.println("Ingrese el número 2: ");
        n2 = Float.parseFloat(sc.nextLine());

        System.out.println("Ingrese el número 3: ");
        n3 = Float.parseFloat(sc.nextLine());
    }

    public void ordering() {
        float min, mid, max;

        if (n1 <= n2 && n1 <= n3) {
            min = n1;
            if (n2 <= n3) {
                mid = n2;
                max = n3;
            } else {
                mid = n3;
                max = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            min = n2;
            if (n1 <= n3) {
                mid = n1;
                max = n3;
            } else {
                mid = n3;
                max = n1;
            }
        } else {
            min = n3;
            if (n1 <= n2) {
                mid = n1;
                max = n2;
            } else {
                mid = n2;
                max = n1;
            }
        }

        System.out.println("Orden ascendente: " + min + ", " + mid + ", " + max);
    }
}
