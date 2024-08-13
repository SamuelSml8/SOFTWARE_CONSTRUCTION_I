package workshop_1;

import java.util.Scanner;

public class Discount_calculator {

    Scanner sc = new Scanner(System.in);
    float price, discount;

    public Discount_calculator() {
        System.out.println("Precio original: ");
        price = Float.parseFloat(sc.nextLine());

        System.out.println("Porcentaje de descuento: ");
        discount = Float.parseFloat(sc.nextLine());
    }

    public void finalPrice() {
        float discountPrice = price - (price * (discount / 100));
        System.out.println("El precio final es: " + discountPrice);
    }
}
