package ud6.fxml.fxmlEmpresa;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppEmpresa extends Application {

    static List<Empresa> empresas = new ArrayList<>();
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Empresa");
        Scene scene = new Scene(FXMLLoader.load(AppEmpresa.class.getResource("EmpresaVista.fxml")));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        empresas.add(new Empresa(1, "IES Chan do Monte", "https://centros.edu.xunta.gal/ieschanmonte/aulavirtual"));
        launch();
    }
}
