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
    }
}