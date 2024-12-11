import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú de opciones
            System.out.println("\nCalculadora - Menú de Operaciones");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Porcentaje");
            System.out.println("7. División con residuo");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 7) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1: // Suma
                        System.out.printf("Resultado de la suma: %.2f%n", num1 + num2);
                        break;
                    case 2: // Resta
                        System.out.printf("Resultado de la resta: %.2f%n", num1 - num2);
                        break;
                    case 3: // Multiplicación
                        System.out.printf("Resultado de la multiplicación: %.2f%n", num1 * num2);
                        break;
                    case 4: // División
                        if (num2 != 0) {
                            System.out.printf("Resultado de la división: %.2f%n", num1 / num2);
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                    case 5: // Potencia
                        System.out.printf("Resultado de la potencia: %.2f%n", Math.pow(num1, num2));
                        break;
                    case 6: // Porcentaje
                        System.out.printf("%.2f%% de %.2f es: %.2f%n", num2, num1, (num1 * num2) / 100);
                        break;
                    case 7: // División con residuo
                        if (num2 != 0) {
                            System.out.printf("Resultado de la división: %.0f, Residuo: %.0f%n", Math.floor(num1 / num2), num1 % num2);
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (opcion != 8) {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 8);

        System.out.println("Gracias por usar la calculadora. ¡Adiós!");
        scanner.close();
    }
}
