import java.util.Scanner;

public class sumamatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizS = new int[3][3];

        // Leer la matriz A
        System.out.println("Ingrese los elementos de la matriz A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Leer la matriz B
        System.out.println("\nIngrese los elementos de la matriz B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Sumar las matrices A y B para obtener la matriz S
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Mostrar la matriz resultante S
        System.out.println("\nLa matriz resultante S es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizS[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
