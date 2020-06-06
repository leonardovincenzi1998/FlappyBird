package view;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class EndGameMenuImpl implements EndGameMenu {

    private final FlappyBirdViewImpl view;
    Button quitBtn = new Button("Return to Main Menu");

    public EndGameMenuImpl(FlappyBirdViewImpl view){
        this.view = view;
    }

    public void quitBtn() {
        double btnWidth = 250.0;
        double btnHeight = 50.0;

        quitBtn.setPrefSize(btnWidth, btnHeight);
        quitBtn.setLayoutX((view.getWidth()/ 2) - (btnWidth / 2));
        quitBtn.setLayoutY(view.getHeight() / 2);
        quitBtn.setAlignment(Pos.CENTER);

        quitBtn.setOnAction(actionEvent -> {
            final Parent menu;
            try {
                menu = FXMLLoader.load(ClassLoader.getSystemResource("layouts/main.fxml"));
                final Scene menuScene = new Scene(menu);

                final Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                window.setScene(menuScene);
                window.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

    }
}
