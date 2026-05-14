package ud6.fxml.fxmlEmpresa;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EmpresaControlador implements Initializable {

    @FXML
    private ListView<Empresa> lstRes;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtWeb;

    @FXML
    void actualizar(ActionEvent event) {
        Empresa e = new Empresa(Integer.parseInt(txtId.getText()));
        int i = lstRes.getItems().indexOf(e);

        Empresa eL = lstRes.getItems().get(i);

    }

    @FXML
    void agregar(ActionEvent event) {
        // @TODO Validar valores
        Empresa e = new Empresa(
            Integer.parseInt(txtId.getText()),
            txtNombre.getText(), 
            txtWeb.getText()
        );

        // @TODO Comprobar que no este
        lstRes.getItems().add(e);
    }

    @FXML
    void borrar(ActionEvent event) {
        Empresa eABorrar = new Empresa(Integer.parseInt(txtId.getText()));
        lstRes.getItems().remove(eABorrar);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lstRes.getItems().addAll(AppEmpresa.empresas);
    }

}
