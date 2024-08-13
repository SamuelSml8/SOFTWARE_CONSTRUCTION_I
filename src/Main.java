import workshop_1.*;

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

        // Call the function and show result
        numberOrdering.ordering();

        // 4. ----------------------

        // Discount Calculator instance
        Discount_calculator calculator = new Discount_calculator();

        // Call the function and show result
        calculator.finalPrice();

        // 5. ----------------------

        // Multiplication table instance
        Multiplication_table table = new Multiplication_table();

        //Call the function and show result
        table.showTable();

        // 6. ----------------------

        // Average instance
        Average myAverage = new Average();

        // Call the function
        float avg = myAverage.calculateAvg();

        // Show result
        System.out.println("The average is: " + avg);

    }
}