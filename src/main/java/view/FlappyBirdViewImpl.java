package view;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    private ScoresImpl scores;
    final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public FlappyBirdViewImpl(final Stage primaryStage, final FlappyGameViewObserver observer) throws IOException {
        this.primaryStage = primaryStage;
        this.observer = observer;
        this.scores = new ScoresImpl();
    }

    @Override
    public void start() {
        screenSize.setSize(WIDTH,HEIGHT);
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
        this.score.setFont(new Font("Arial", this.root.getHeight()/FONT_SIZE));
        this.score.setTextFill(Paint.valueOf(String.valueOf(Color.WHITE)));
        this.root.getChildren().add(this.score);

        background.fitWidthProperty().bind(root.widthProperty());
        background.fitHeightProperty().bind(root.heightProperty());

        this.observer.startGame();

        primaryStage.setScene(scene);
        scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {

            int keypresstime = 0;
            if ((event.getCode() == KeyCode.SPACE)) {

                this.observer.pressSpace();
                keypresstime++;
                System.out.println(keypresstime);
            }
        });

       /*this.scene.addEventHandler(KeyEvent.KEY_RELEASED, event -> {
=======
       /*scene.addEventHandler(KeyEvent.KEY_RELEASED, event -> {
>>>>>>> fec063c5191fcd559d1823fd5189d40c959eb918
            if (event.getCode() == KeyCode.SPACE) {
                this.observer.pressSpace();
            }
        });*/
    }

    @Override
    public void saveScore(int points) throws IOException {
        this.scores.writeScore(points);
    }

    public void quitBtn() {
        double btnWidth = 250.0;
        double btnHeight = 50.0;
        Button quitBtn = new Button("Return to Main Menu");

        quitBtn.setPrefSize(btnWidth,btnHeight);
        quitBtn.setLayoutX((WIDTH/2)-(btnWidth/2));
        quitBtn.setLayoutY(HEIGHT/2);
        quitBtn.setAlignment(Pos.CENTER);

        root.getChildren().add(quitBtn);

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

    @Override
    public void setScore(int score) {
        this.score.setText("Score: " + score );
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

}

