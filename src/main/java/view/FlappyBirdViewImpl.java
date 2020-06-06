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

import java.awt.*;


public class FlappyBirdViewImpl implements FlappyBirdView {

    private static final String TITLE = "Flappy Bird";
    private static final double HEIGHT = 335;
    private static final double WIDTH = 600;
    private static final int FONT_SIZE = 18;
    private final Label score = new Label();
    private final Stage primaryStage;
    private Pane root;
    private FlappyGameViewObserver observer;
    private final EndGameMenuImpl endGameMenu;
    final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


    public FlappyBirdViewImpl(final Stage primaryStage, final FlappyGameViewObserver observer) {
        this.primaryStage = primaryStage;
        this.observer = observer;
        this.endGameMenu =  new EndGameMenuImpl(this);
    }

    @Override
    public void start() {
        screenSize.setSize(WIDTH, HEIGHT);
        this.primaryStage.setTitle(TITLE);
        this.primaryStage.centerOnScreen(); //BOH
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

    public void getQuitBtn(){
        this.root.getChildren().add(endGameMenu.quitBtn);
        this.endGameMenu.quitBtn();
    }

    @Override
    public void setScore(int score) {
        this.score.setText("Score: " + score);
    }

    @Override
    public void setObserver(FlappyGameViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void addChildren(Node n) {
        this.root.getChildren().add(n);
    }

    @Override
    public void removeChildren(Node n) {
        this.root.getChildren().remove(n);
    }

    public Pane getRoot(){
        return this.root;
    }

    public double getHeight() {
        return this.HEIGHT;
    }

    public double getWidth() {
        return this.WIDTH;
    }
}




