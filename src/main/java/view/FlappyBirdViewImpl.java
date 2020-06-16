package view;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import util.IOScores;

import java.awt.*;
import java.io.IOException;


public class FlappyBirdViewImpl implements FlappyBirdView {

    private static final String TITLE = "Flappy Bird";
    private static final double HEIGHT = 335;
    private static final double WIDTH = 600;
    private static final int FONT_SIZE = 18;
    private final Label score = new Label();
    private final Stage primaryStage;
    private Pane root;
    private FlappyGameViewObserver observer;

    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


    public FlappyBirdViewImpl(final Stage primaryStage, final FlappyGameViewObserver observer) throws IOException {
        this.primaryStage = primaryStage;
        this.observer = observer;
    }

    @Override
    public void start() {
        screenSize.setSize(WIDTH, HEIGHT);
        this.primaryStage.setTitle(TITLE);
        this.primaryStage.centerOnScreen();
        /*this.primaryStage.setMaximized(false);
        this.primaryStage.setFullScreen(false);*/
        /*this.primaryStage.setMinHeight(HEIGHT);
        this.primaryStage.setMinWidth(WIDTH);*/
        this.setGameBackground(screenSize);
    }

    private void setGameBackground(final Dimension screenSize) {
        this.root = new Pane();
        Scene scene = new Scene(this.root, (screenSize.getWidth()), screenSize.getHeight());
        final ImageView background = new ImageView(new Image(ClassLoader.getSystemResource("background.jpeg").toString()));
        this.root.getChildren().add(background);

        this.score.setText("Score: 0");
        this.score.setFont(new Font("Arial", this.root.getHeight() / FONT_SIZE));
        this.score.setTextFill(Paint.valueOf(String.valueOf(Color.WHITE)));
        this.root.getChildren().add(this.score);

        background.fitWidthProperty().bind(root.widthProperty());
        background.fitHeightProperty().bind(root.heightProperty());

        this.observer.startGame();

        primaryStage.setScene(scene);
        scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if ((event.getCode() == KeyCode.SPACE)) {
                this.observer.pressSpace();
            }
        });
    }

    @Override
    public void endGame(final int userScore) throws IOException {
        EndGameMenuImpl endGameMenu = new EndGameMenuImpl(this, userScore);
        this.root.getChildren().add(endGameMenu.quitBtn);
        endGameMenu.quitBtn();
    }

    @Override
    public void setScore(final int score) {
        this.score.setText("Score: " + score);
    }

    @Override
    public void setObserver(final FlappyGameViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void addChildren(final Node n) {
        this.root.getChildren().add(n);
    }

    @Override
    public void removeChildren(final Node n) {
        this.root.getChildren().remove(n);
    }

    public final Pane getRoot(){
        return this.root;
    }

    public final double getHeight() {
        return HEIGHT;
    }

    public final double getWidth() {
        return WIDTH;
    }
}




