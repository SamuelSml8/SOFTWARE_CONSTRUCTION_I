package workshop_2;

import java.util.Scanner;
import java.util.Vector;

public class OrderingNumbers {
    Scanner sc = new Scanner(System.in);
    Vector<Integer> evenNumbers = new Vector<>();
    Vector<Integer> oddNumbers = new Vector<>();

    public void numbersToOrdering() {
        System.out.println("Ingrese el número de enteros: ");
        int numbersQuantity = Integer.parseInt(sc.nextLine());

        for (int s = 1; s <= numbersQuantity; s++) {
            System.out.println("Ingrese el número N-" + s + ": ");
            int number = Integer.parseInt(sc.nextLine());

            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        System.out.println("Números pares: " + evenNumbers);
        System.out.println("Números impares: " + oddNumbers);
    }

}
