package workshop_1;

import java.util.Scanner;

public class Leap_year {
    Scanner sc = new Scanner(System.in);
    int year;

    public Leap_year() {
        System.out.println("Ingrese el año: ");
        year = Integer.parseInt(sc.nextLine());
    }

    public boolean isLeapYear() {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
}
