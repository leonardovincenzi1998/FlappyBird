package view;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import util.IOScores;

import java.io.IOException;

public class EndGameMenuImpl implements EndGameMenu {

    private FlappyBirdViewImpl view = null;
    Button quitBtn = new Button("QUIT");
    private static final double FX_OBJECT_WIDTH = 250;
    private static final double FX_OBJECT_HEIGHT = 50;
    private int userScore = 0;
    private IOScores ioScores = new IOScores();


    public EndGameMenuImpl(final FlappyBirdViewImpl view, final int userScore) {
        this.view = view;
        this.userScore = userScore;
    }

    public final void quitBtn() throws IOException {
        quitBtn.setPrefSize(FX_OBJECT_WIDTH, FX_OBJECT_HEIGHT);
        quitBtn.setLayoutX((view.getWidth() / 2) - (FX_OBJECT_WIDTH  / 2));
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
