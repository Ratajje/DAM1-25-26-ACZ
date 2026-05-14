package ud6.iniciacion;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ConversorV2 extends Application {

    private TextField txtValor;
    private ComboBox<String> comboConversiones;
    private Label lblReturn;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage escenario) {

        // 1. TextField solo para el número
        txtValor = new TextField();
        txtValor.setPromptText("Introduce la cantidad...");
        txtValor.setMaxWidth(150);

        // 2. ComboBox para seleccionar el tipo de conversión
        comboConversiones = new ComboBox<>();
        comboConversiones.getItems().addAll(
            "Euros a Dólares",
            "Libras a Kilos",
            "Millas a Kilómetros"
        );
        comboConversiones.getSelectionModel().selectFirst(); // Selecciona el primero por defecto

        Button btnConvertir = new Button("Convertir");
        lblReturn = new Label("Resultado aparecerá aquí");

        btnConvertir.setOnAction(e -> convertir());

        // 3. Mejoramos el diseño del VBox añadiendo espaciado (15px) y centrado
        VBox root = new VBox(15, txtValor, comboConversiones, btnConvertir, lblReturn);
        root.setAlignment(Pos.CENTER);

        Scene escena = new Scene(root, 400, 250);

        escenario.setScene(escena);
        escenario.setTitle("Conversor de Medidas");
        escenario.show();
    }

    private void convertir() {
        // Reiniciamos el color del texto por si hubo un error previo
        lblReturn.setTextFill(Color.BLACK);

        try {
            // 1. Intentamos convertir el texto a número. Si hay letras, salta al catch.
            String textoIntroducido = txtValor.getText().trim();
            // Cambiamos comas por puntos por si el usuario usa la coma decimal
            textoIntroducido = textoIntroducido.replace(",", "."); 
            double cantidad = Double.parseDouble(textoIntroducido);
            
            double resultado = 0;
            String unidadResultado = "";

            // 2. Obtenemos qué opción seleccionó el usuario en el ComboBox
            int opcion = comboConversiones.getSelectionModel().getSelectedIndex();

            switch (opcion) {
                case 0: // Euros a Dólares
                    resultado = cantidad * 1.13; // Ajustado al valor de tu comentario
                    unidadResultado = " $";
                    break;
                case 1: // Libras a Kilos
                    resultado = cantidad * 0.4535924;
                    unidadResultado = " kg";
                    break;
                case 2: // Millas a Kilómetros
                    resultado = cantidad * 1.609344;
                    unidadResultado = " km";
                    break;
            }

            // Formateamos para que solo muestre 2 decimales
            lblReturn.setText(String.format("Resultado: %.2f%s", resultado, unidadResultado));

        } catch (NumberFormatException ex) {
            // Si el usuario metió letras o símbolos raros, le avisamos en rojo
            lblReturn.setTextFill(Color.RED);
            lblReturn.setText("Error: Introduce un número válido.");
        }
    }
}