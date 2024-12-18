package org.hugo.ejercicioc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * La clase HelloApplication es la aplicación principal que inicia la interfaz gráfica de usuario (GUI).
 * Extiende la clase Application de JavaFX.
 */
public class AppPersonas extends Application {

    /**
     * El metodo start es el punto de entrada de la aplicación.
     * @param stage El escenario principal donde se mostrará la escena.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppPersonas.class.getResource("EjercicioC.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Image icon = new Image(getClass().getResourceAsStream("/Imagenes/icono.png"));
        stage.getIcons().add(icon);
        stage.setTitle("Personas");
        stage.setResizable(false);
        stage.setMinWidth(600);
        stage.setMinHeight(400);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * El metodo main es el punto de entrada de la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}
