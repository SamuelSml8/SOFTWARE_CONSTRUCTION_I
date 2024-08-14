import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String lastOperation = "";
        boolean go = true;
        Scanner sc = new Scanner(System.in);
        Calculator myCalculator = new Calculator();

        do {
            System.out.println("\nCalculadora\n");
            System.out.println("1) Realizar operación");
            System.out.println("2) Mostrar la última operación");
            System.out.println("3) Salir");
            System.out.println("Elija su opción: ");
            String option = sc.nextLine();

            if (option.equals("1")) {
                System.out.println("\nPrimer número: ");
                float num1 = Float.parseFloat(sc.nextLine());

                System.out.println("\n1) +\n2) -");
                System.out.println("Elija el operador: ");
                String operation = sc.nextLine();

                System.out.println("\nSegundo número: ");
                float num2 = Float.parseFloat(sc.nextLine());

                if (operation.equals("1")) {
                    float result = myCalculator.sum(num1, num2);
                    lastOperation = num1 + " + " + num2 + " = " + result;
                    System.out.println("\nResultado: " + lastOperation);
                } else {
                    float result = myCalculator.substract(num1, num2);
                    lastOperation = num1 + " - " + num2 + " = " + result;
                    System.out.println("\nResultado: " + lastOperation);
                }
            } else if (option.equals("2")) {
                System.out.println(lastOperation);
            } else if (option.equals("3")) {
                System.out.println("!Gracias por usar la calculadora!");
                go = false;
            } else {
                System.out.println("Opción inválida");
            }

        } while (go);
    }
}