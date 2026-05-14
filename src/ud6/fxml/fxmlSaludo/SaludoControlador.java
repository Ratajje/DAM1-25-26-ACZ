package ud6.fxml.fxmlSaludo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SaludoControlador {

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNombre;

    @FXML
    void saludar(ActionEvent event) {
        lblResultado.setText("Hola " + txtNombre.getText());
    }

}
