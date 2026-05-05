package ud6.iniciacion;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Crea una aplicación que permita convertir cantidades de un sistema de
 * medida a otro. Por ejemplo, de euros a dólares (1 € = 1,13 $), de libras a
 * kilos (1 libra =
 * 0.4535924 kilos), de millas a kilómetros (1 milla = 1.609344 kilómetros),
 * etc.
 * Experimenta con nuevos controles para ampliar el programa y que permita
 * convertir en
 * ambos sentidos o cambiar de un tipo de conversión a otra.
 * 
 */
public class Conversor extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage escenario) throws Exception {

        Text txt = new Text("Introduce sistema (€, libra, milla)");
        TextField txtValor = new TextField();
        Button btnConvertir = new Button("Convertir");
        Label lblReturn = new Label();
        
        btnConvertir.setOnAction(e -> convertir());

        VBox root = new VBox(txt, txtValor, btnConvertir, lblReturn);

        Scene escena = new Scene(root, 400, 200);

        escenario.setScene(escena);
        escenario.show();
    }

    private void convertir() {
        
    }
}
