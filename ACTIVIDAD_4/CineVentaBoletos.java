import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CineVentaBoletos extends Application {

    private List<Venta> ventas = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sistema de Venta de Boletos de Cine");

        // Layout principal
        VBox layout = new VBox(10);
        layout.setPadding(new javafx.geometry.Insets(10));

        // Controles de GUI
        Label lblPelicula = new Label("Selecciona la película:");
        ComboBox<String> cbPelicula = new ComboBox<>();
        cbPelicula.getItems().addAll("Película 1", "Película 2", "Película 3");

        Label lblBoletos = new Label("Número de boletos:");
        TextField txtBoletos = new TextField();

        Label lblCategoria = new Label("Categoría de asistentes:");
        ComboBox<String> cbCategoria = new ComboBox<>();
        cbCategoria.getItems().addAll("Adulto", "Niño", "Adulto Mayor");

        Label lblSala = new Label("Tipo de sala:");
        ComboBox<String> cbSala = new ComboBox<>();
        cbSala.getItems().addAll("Normal", "3D");

        Button btnCalcular = new Button("Calcular Total");
        Label lblTotal = new Label("Total: $0.00");

        Button btnVenta = new Button("Registrar Venta");
        Button btnResumen = new Button("Mostrar Resumen");

        layout.getChildren().addAll(
            lblPelicula, cbPelicula, 
            lblBoletos, txtBoletos,
            lblCategoria, cbCategoria,
            lblSala, cbSala,
            btnCalcular, lblTotal,
            btnVenta, btnResumen
        );

        // Lógica de los botones
        btnCalcular.setOnAction(e -> {
            try {
                int boletos = Integer.parseInt(txtBoletos.getText());
                String categoria = cbCategoria.getValue();
                String sala = cbSala.getValue();

                double total = calcularTotal(boletos, categoria, sala);
                lblTotal.setText("Total: $" + String.format("%.2f", total));
            } catch (NumberFormatException ex) {
                showAlert("Error", "Por favor, ingrese un número válido de boletos.");
            }
        });

        btnVenta.setOnAction(e -> {
            try {
                String pelicula = cbPelicula.getValue();
                int boletos = Integer.parseInt(txtBoletos.getText());
                String categoria = cbCategoria.getValue();
                String sala = cbSala.getValue();
                double total = calcularTotal(boletos, categoria, sala);

                ventas.add(new Venta(pelicula, boletos, categoria, sala, total));
                showAlert("Éxito", "Venta registrada correctamente.");

                // Limpiar campos
                cbPelicula.setValue(null);
                txtBoletos.clear();
                cbCategoria.setValue(null);
                cbSala.setValue(null);
                lblTotal.setText("Total: $0.00");
            } catch (Exception ex) {
                showAlert("Error", "Por favor, complete todos los campos correctamente.");
            }
        });

        btnResumen.setOnAction(e -> mostrarResumen());

        // Configuración de la escena
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private double calcularTotal(int boletos, String categoria, String sala) {
        double precioBase;
        LocalTime horaActual = LocalTime.now();
        boolean esMiercoles = java.time.LocalDate.now().getDayOfWeek() == java.time.DayOfWeek.WEDNESDAY;

        if (esMiercoles) {
            precioBase = 45;
        } else if (categoria.equals("Niño") || categoria.equals("Adulto Mayor")) {
            precioBase = 42;
        } else if (horaActual.isBefore(LocalTime.of(18, 0))) {
            precioBase = 52;
        } else {
            precioBase = 65;
        }

        if (sala.equals("3D")) {
            precioBase += 80;
        }

        return boletos * precioBase;
    }

    private void mostrarResumen() {
        double totalRecaudado = ventas.stream().mapToDouble(Venta::getTotal).sum();
        int totalBoletos = ventas.stream().mapToInt(Venta::getBoletos).sum();

        showAlert("Resumen", "Total de boletos vendidos: " + totalBoletos + "\nTotal recaudado: $" + String.format("%.2f", totalRecaudado));
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    static class Venta implements Serializable {
        private final String pelicula;
        private final int boletos;
        private final String categoria;
        private final String sala;
        private final double total;

        public Venta(String pelicula, int boletos, String categoria, String sala, double total) {
            this.pelicula = pelicula;
            this.boletos = boletos;
            this.categoria = categoria;
            this.sala = sala;
            this.total = total;
        }

        public double getTotal() {
            return total;
        }

        public int getBoletos() {
            return boletos;
        }
    }
}
