package view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.Flappy;
import model.FlappyImpl;

import java.awt.*;

public class FlappyBirdViewImpl implements FlappyBirdView {

    private static final String TITLE = "Flappy Bird";
    private static final double HEIGHT = 335;
    private static final double WIDTH = 600;
    private static final int FONT_SIZE = 20;
    private final Label score = new Label();
    private final Stage primaryStage;
    private AnchorPane root;
    private Scene scene;
    private FlappyGameViewObserver observer;

    //oggetti per stampare uccellino
    Flappy flappy= new FlappyImpl();
    Rectangle r = new Rectangle();
    Image ico = new Image(flappy.getFlappyImagePath());


    public FlappyBirdViewImpl(final Stage primaryStage, final FlappyGameViewObserver observer) {
        this.primaryStage = primaryStage;
        this.observer = observer;
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenSize.setSize(WIDTH,HEIGHT);
        this.primaryStage.setTitle(TITLE);
        this.primaryStage.centerOnScreen(); //BOH
        /*this.primaryStage.setMaximized(false);
        this.primaryStage.setFullScreen(false);*/
        this.primaryStage.setMinHeight(HEIGHT);
        this.primaryStage.setMinWidth(WIDTH);
        this.setGameBackground(screenSize);
        //System.out.println("Ciao");

    }



    private void setGameBackground(final Dimension screenSize) {
        this.root = new AnchorPane();
        this.scene = new Scene(this.root, (screenSize.getWidth()), screenSize.getHeight());
        final ImageView background = new ImageView(new Image(ClassLoader.getSystemResource("background.jpeg").toString()));
        //background.setVisible(true);
        this.root.getChildren().add(background);

        //BOZZA SCORE
        /*this.score.setText("0");
        this.score.setFont(new Font("Arial", this.root.getHeight() / FONT_SIZE));
        AnchorPane.setRightAnchor(this.score, 0.);
        AnchorPane.setTopAnchor(this.score, 0.);
        this.root.getChildren().add(this.score);*/

        background.fitWidthProperty().bind(root.widthProperty());
        background.fitHeightProperty().bind(root.heightProperty());
        this.observer.startGame();
        primaryStage.setScene(this.scene);

        //this.printBird();

    }
    @Override
    public void printBird() {
        r.setTranslateX(flappy.getPosX());
        r.setTranslateY(flappy.getGravity());
        r.setWidth(flappy.getWidthBird());
        r.setHeight(flappy.getHeightBird());
        r.setFill(new ImagePattern(ico));
        this.root.getChildren().add(r);
    }


    @Override
    public void start() {

    }

    /*@Override
    public void setScore () {

    }*/
}

