import java.util.Scanner;

class Empleado {
    // Variables de instancia
    private int idEmpleado;
    private String nombreEmpleado;
    private String puesto;
    private double[] sueldoQuincenal;

    // Constructor
    public Empleado() {
        sueldoQuincenal = new double[1]; // Sueldo para una quincena
    }

    // Método para validar y aceptar datos del empleado
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);

        // Validar ID
        System.out.print("Ingrese el ID del empleado (número positivo): ");
        while (!scanner.hasNextInt() || (idEmpleado = scanner.nextInt()) <= 0) {
            System.out.println("Error: El ID debe ser un número positivo.");
            scanner.nextLine();
            System.out.print("Ingrese el ID del empleado (número positivo): ");
        }
        scanner.nextLine(); // Limpiar buffer

        // Validar nombre
        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = scanner.nextLine();
        while (nombreEmpleado.isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            System.out.print("Ingrese el nombre del empleado: ");
            nombreEmpleado = scanner.nextLine();
        }

        // Validar puesto
        System.out.print("Ingrese el puesto del empleado (Empleado o Supervisor): ");
        puesto = scanner.nextLine();
        while (!puesto.equalsIgnoreCase("Empleado") && !puesto.equalsIgnoreCase("Supervisor")) {
            System.out.println("Error: El puesto debe ser 'Empleado' o 'Supervisor'.");
            System.out.print("Ingrese el puesto del empleado (Empleado o Supervisor): ");
            puesto = scanner.nextLine();
        }
    }

    // Método para calcular el sueldo quincenal
    public void calcularSueldo() {
        Scanner scanner = new Scanner(System.in);

        if (puesto.equalsIgnoreCase("Empleado")) {
            double sueldoBase = 5000;
            System.out.print("Ingrese las horas extras diurnas trabajadas: ");
            int horasExtrasDiurnas = scanner.nextInt();

            System.out.print("Ingrese las horas extras nocturnas trabajadas: ");
            int horasExtrasNocturnas = scanner.nextInt();

            sueldoQuincenal[0] = sueldoBase + (horasExtrasDiurnas * 50) + (horasExtrasNocturnas * 60);
        } else if (puesto.equalsIgnoreCase("Supervisor")) {
            double sueldoBase = 8000;
            double deducciones = sueldoBase * (0.002 + 0.001 + 0.0016); // INFONAVIT, Seguro, ISR
            sueldoQuincenal[0] = sueldoBase - deducciones;
        }
    }

    // Método para mostrar los datos del empleado y el sueldo calculado
    public void mostrarDatos() {
        System.out.println("\nDatos del empleado:");
        System.out.println("ID: " + idEmpleado);
        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Puesto: " + puesto);
        System.out.printf("Sueldo quincenal: %.2f%n", sueldoQuincenal[0]);
    }
}

public class CalculadoraSueldo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.ingresarDatos();
        empleado.calcularSueldo();
        empleado.mostrarDatos();
    }
}
