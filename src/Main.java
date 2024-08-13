import workshop_1.Leap_year;
import workshop_1.Number_ordering;
import workshop_1.Triangle;

public class Main {
    public static void main(String[] args) {
        // Triangle instance
        Triangle triangle = new Triangle();

        // Call the functions
        boolean isEquilateral = triangle.isEquilateral();
        boolean isIsosceles = triangle.isIsosceles();
        boolean isScalene = triangle.isScalene();

        // Show results
        System.out.println("Is Equilateral: " + isEquilateral);
        System.out.println("Is Isosceles: " + isIsosceles);
        System.out.println("Is Scalene: " + isScalene);

        // 2. ----------------------

        // Leap year instance
        Leap_year leapYear = new Leap_year();

        // Call the function
        boolean isLeapYear = leapYear.isLeapYear();

        // Show result
        System.out.println("Is leap year: " + isLeapYear);

        // 3. ----------------------

        // Number ordering instance
        Number_ordering numberOrdering = new Number_ordering();

        // Call the function and Show result
        numberOrdering.ordering();
    }
}