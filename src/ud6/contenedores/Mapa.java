package ud6.contenedores;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Mapa extends Application {

    int[][] mapa = {
            { 1, 0, 1, 1, 1, 1 },
            { 1, 0, 1, 0, 0, 1 },
            { 1, 0, 1, 0, 1, 1 },
            { 1, 0, 0, 0, 0, 1 },
            { 1, 1, 1, 1, 0, 1 },
    };

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();

        for (int i = 0; i < mapa.length; i++) {

            for (int j = 0; j < mapa[i].length; j++) {
                Label lbl = new Label();
                lbl.setOnMouseClicked(e -> lbl.setStyle("-fx-background-color: red;"));
                if (mapa[i][j] == 1) {
                   lbl.setStyle("-fx-background-color: blue;");
                }
                
                lbl.setPrefSize(50, 50);
                gridPane.add(lbl, j, i);
            }
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
