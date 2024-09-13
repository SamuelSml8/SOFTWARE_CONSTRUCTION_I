import Models.Task;
import workshop_2.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calculation of grade point average

        // GradeAverage instance
        GradeAverage myGrade = new GradeAverage();

        // Call the function and show it
        System.out.println(myGrade.status());

        // Task list management
        TaskManagement myTaskList = new TaskManagement();

        while (true) {
            System.out.println("\nGESTIÓN DE TAREAS\n");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Tareas pendientes");
            System.out.println("4. Salir\n");
            System.out.println("Opción deseada: ");
            String option = sc.nextLine();

            if (option.equals("1")) {
                System.out.println("\nAGREGAR TAREA");
                System.out.println("\nTítulo: ");
                String title = sc.nextLine();
                System.out.println("\nDescripción: ");
                String description = sc.nextLine();
                Task task = new Task(title, description, false);
                System.out.println(myTaskList.addTask(task));
            } else if (option.equals("2")) {
                System.out.println("\nMARCAR TAREA COMPLETADA");
                System.out.println("\nID de la tarea: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println(myTaskList.taskDone(id));
            } else if (option.equals("3")) {
                System.out.println("\nTAREAS PENDIENTES");
                System.out.println(myTaskList.getPendingTasks());
            } else if (option.equals("4")) {
                System.out.println(myTaskList.exit());
                break;
            } else {
                System.out.println("\nOpción inválida");
            }
        }

        // Ordering of odd and even numbers in separate lists

        // Instance OrderingNumbers
        OrderingNumbers myNumbers = new OrderingNumbers();

        // Call the method
        myNumbers.numbersToOrdering();

        // Addition of matrices

        // Instance MatrixAddition
        MatrixAddition myMatrixAddition = new MatrixAddition();

        // Calculation of the factorial of a number

        // Instance FactorialNumber
        FactorialNumber myFactorial = new FactorialNumber();
    }

}