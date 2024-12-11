import java.util.Scanner;

public class PromedioPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPositivos = 0, sumaNegativos = 0;
        int cuentaPositivos = 0, cuentaNegativos = 0;

        // Leer los 10 números y almacenarlos en el array
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Clasificar el número como positivo o negativo
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                cuentaPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                cuentaNegativos++;
            }
        }

        // Calcular y mostrar los promedios
        if (cuentaPositivos > 0) {
            double promedioPositivos = (double) sumaPositivos / cuentaPositivos;
            System.out.printf("Promedio de números positivos: %.2f%n", promedioPositivos);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        if (cuentaNegativos > 0) {
            double promedioNegativos = (double) sumaNegativos / cuentaNegativos;
            System.out.printf("Promedio de números negativos: %.2f%n", promedioNegativos);
        } else {
            System.out.println("No se ingresaron números negativos.");
        }

        scanner.close();
    }
}
