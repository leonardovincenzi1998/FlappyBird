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

    private final FlappyBirdViewImpl view;
    Button quitBtn = new Button("QUIT");
    private static final double FX_OBJECT_WIDTH = 250;
    private static final double FX_OBJECT_HEIGHT = 50;
    private final int userScore;
    private final IOScores ioScores = new IOScores();

    /**
     * This is the method constructor, which initiates the view, that is used for set the size of Quit button, and the score that has to be saved
     * @param view FlappyBirdViewImpl, the principal view
     * @param userScore The score of the user
     */
    public EndGameMenuImpl(final FlappyBirdViewImpl view, final int userScore) {
        this.view = view;
        this.userScore = userScore;
    }

    public final void quitBtn() {
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

    private void sendScore() {
        ioScores.writeScore(this.userScore);
    }

}
