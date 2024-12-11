import java.util.Scanner;

public class PromedioPosicionesPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPares = 0;
        int cuentaPares = 0;

        // Leer los 10 números y almacenarlos en el array
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verificar si la posición es par
            if (i % 2 == 0) {
                sumaPares += numeros[i];
                cuentaPares++;
            }
        }

        // Calcular y mostrar el promedio de las posiciones pares
        if (cuentaPares > 0) {
            double promedioPares = (double) sumaPares / cuentaPares;
            System.out.printf("Promedio de números en posiciones pares: %.2f%n", promedioPares);
        } else {
            System.out.println("No hay números en posiciones pares.");
        }

        scanner.close();
    }
}
