package workshop_2;

import java.util.Scanner;

public class MatrixAddition {

    Scanner sc = new Scanner(System.in);
    int rows;
    int columns;

    public MatrixAddition() {
        System.out.print("Ingrese el número de filas: ");
        rows = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el número de columnas: ");
        columns = Integer.parseInt(sc.nextLine());

        if (rows != columns) {
            System.out.println("ERROR");
            return;
        }

        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];
        int[][] matrixC = new int[rows][columns];

        System.out.println("\nMATRIZ NÚMERO 1");
        for (int s = 0; s < matrixA.length; s++) {
            for (int j = 0; j < matrixA[s].length; j++) {
                System.out.print("Valor de la fila " + s + " y columna " + j + ": ");
                matrixA[s][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("\nMATRIZ NÚMERO 2");
        for (int s = 0; s < matrixB.length; s++) {
            for (int j = 0; j < matrixB[s].length; j++) {
                System.out.print("Valor de la fila " + s + " y columna " + j + ": ");
                matrixB[s][j] = Integer.parseInt(sc.nextLine());
            }
        }

        for (int s = 0; s < matrixA.length; s++) {
            for (int j = 0; j < matrixA[s].length; j++) {
                matrixC[s][j] = matrixA[s][j] + matrixB[s][j];
            }
        }

        for (int s = 0; s < matrixC.length; s++) {
            for (int j = 0; j < matrixC[s].length; j++) {
                System.out.println(matrixC[s][j] + " ");
            }
        }
    }

}
