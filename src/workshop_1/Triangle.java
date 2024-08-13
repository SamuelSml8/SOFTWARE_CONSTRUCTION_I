/*
  Equilateral: all sides are equal.
  Isosceles: two sides are equal and the third is different.
  Scalene: all sides are different.
*/

package workshop_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triangle {
    List<Float> sides = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Triangle() {
        System.out.println("Ingrese la longitud del lado 1: ");
        float sideOne = Float.parseFloat(sc.nextLine());

        System.out.println("Ingrese la longitud del lado 2: ");
        float sideTwo = Float.parseFloat(sc.nextLine());

        System.out.println("Ingrese la longitud del lado 3: ");
        float sideThree = Float.parseFloat(sc.nextLine());

        sides.add(sideOne);
        sides.add(sideTwo);
        sides.add(sideThree);
    }

    public boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2));
    }

    public boolean isIsosceles() {
        return (sides.get(0).equals(sides.get(1)) && !sides.get(1).equals(sides.get(2))) ||
                (sides.get(0).equals(sides.get(2)) && !sides.get(0).equals(sides.get(1))) ||
                (sides.get(1).equals(sides.get(2)) && !sides.get(0).equals(sides.get(1)));
    }

    public boolean isScalene() {
        return (!sides.get(0).equals(sides.get(1)) &&
                !sides.get(1).equals(sides.get(2)) &&
                !sides.get(0).equals(sides.get(2)));
    }

}
