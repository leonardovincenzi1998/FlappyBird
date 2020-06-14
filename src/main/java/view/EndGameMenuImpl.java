package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import util.IOScores;

import java.io.IOException;

public class EndGameMenuImpl implements EndGameMenu {

    private FlappyBirdViewImpl view=null;
    Button quitBtn = new Button("QUIT");
    private final static double FX_OBJECT_WIDTH = 250;
    private final static double FX_OBJECT_HEIGHT = 50;
    private int userScore=0;
    private IOScores ioScores = new IOScores();


    public EndGameMenuImpl(FlappyBirdViewImpl view,int userScore){
        this.view = view;
        this.userScore = userScore;
    }

    public void quitBtn() throws IOException {
        quitBtn.setPrefSize(FX_OBJECT_WIDTH, FX_OBJECT_HEIGHT);
        quitBtn.setLayoutX((view.getWidth()/ 2) - (FX_OBJECT_WIDTH / 2));
        quitBtn.setLayoutY(view.getHeight() / 2);
        quitBtn.setAlignment(Pos.CENTER);

        quitBtn.setOnAction(actionEvent -> {
            final Parent menu;
            try {
                menu = FXMLLoader.load(ClassLoader.getSystemResource("layouts/endgamemenu.fxml"));
                final Scene menuScene = new Scene(menu);

                final Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                window.setScene(menuScene);
                window.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        sendScore();

    }

    private void sendScore() throws IOException {
        ioScores.writeScore(this.userScore);
    }

}
