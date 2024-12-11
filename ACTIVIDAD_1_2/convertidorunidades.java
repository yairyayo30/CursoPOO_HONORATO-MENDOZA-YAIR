package ACTIVIDAD_1_2;
import java.util.Scanner;

public class convertidorunidades {

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Convertidor de Unidades ===");
            System.out.println("1. Convertir Longitud (metros a centímetros y pulgadas)");
            System.out.println("2. Convertir Masa (kilogramos a libras y gramos)");
            System.out.println("3. Convertir Velocidad (m/s a km/h)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirLongitud(scanner);
                    break;
                case 2:
                    convertirMasa(scanner);
                    break;
                case 3:
                    convertirVelocidad(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    // Método para convertir longitud
    private static void convertirLongitud(Scanner scanner) {
        System.out.print("Ingrese la longitud en metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100;
        double pulgadas = metros * 39.3701;

        System.out.printf("%.2f metros son %.2f centímetros y %.2f pulgadas.%n", metros, centimetros, pulgadas);
    }

    // Método para convertir masa
    private static void convertirMasa(Scanner scanner) {
        System.out.print("Ingrese la masa en kilogramos: ");
        double kilogramos = scanner.nextDouble();
        double libras = kilogramos * 2.20462;
        double gramos = kilogramos * 1000;

        System.out.printf("%.2f kilogramos son %.2f libras y %.2f gramos.%n", kilogramos, libras, gramos);
    }

    // Método para convertir velocidad
    private static void convertirVelocidad(Scanner scanner) {
        System.out.print("Ingrese la velocidad en metros/segundo: ");
        double metrosPorSegundo = scanner.nextDouble();
        double kilometrosPorHora = metrosPorSegundo * 3.6;

        System.out.printf("%.2f metros/segundo son %.2f kilómetros/hora.%n", metrosPorSegundo, kilometrosPorHora);
    }
}
