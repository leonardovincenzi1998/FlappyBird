package application;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;


public final class Main extends Application  {

    private static final int SCENE_WIDTH = 600;
    private static final int SCENE_HEIGHT = 335;

    public void start(final Stage stage) throws Exception {
        final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("layouts/main.fxml"));
        final Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        
        // Stage configuration
        stage.setTitle("Flappy Bird");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);




    }


    public static void main(final String[] args) {
        launch();
    }

}
