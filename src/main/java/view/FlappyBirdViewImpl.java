package view;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Map;

public class FlappyBirdViewImpl implements FlappyBirdView {

    private static final String TITLE = "Flappy Bird";
    private static final double HEIGHT = 335;
    private static final double WIDTH = 600;
    //private static final int FONT_SIZE = 20;
    //private final Label score = new Label();
    private final Stage primaryStage;
    private Pane root;
    private Scene scene;
    private FlappyGameViewObserver observer;
    final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private TubeViewImpl tubeView;
    private FlappyViewImpl flappyView;
    //private Map mappa;


    public FlappyBirdViewImpl(final Stage primaryStage, final FlappyGameViewObserver observer, FlappyViewImpl flappyView/*, Map tubeMap*/) {
        this.primaryStage = primaryStage;
        this.observer = observer;
        //this.mappa = tubeMap;
        //this.tubeView = tubeView;
        this.flappyView = flappyView;
        screenSize.setSize(WIDTH,HEIGHT);
        this.primaryStage.setTitle(TITLE);
        this.primaryStage.centerOnScreen(); //BOH
        /*this.primaryStage.setMaximized(false);
        this.primaryStage.setFullScreen(false);*/
        /*this.primaryStage.setMinHeight(HEIGHT);
        this.primaryStage.setMinWidth(WIDTH);*/
        this.setGameBackground(screenSize);
        //System.out.println("Ciao");

    }

    private void setGameBackground(final Dimension screenSize) {
        this.root = new Pane();

        this.scene = new Scene(this.root, (screenSize.getWidth()), screenSize.getHeight());
        final ImageView background = new ImageView(new Image(ClassLoader.getSystemResource("background.jpeg").toString()));
        //final ImageView tubo = new ImageView(new Image(ClassLoader.getSystemResource("tube.png").toString()));
        this.root.getChildren().add(background);

        //BOZZA SCORE
        /*this.score.setText("0");
        this.score.setFont(new Font("Arial", this.root.getHeight() / FONT_SIZE));
        AnchorPane.setRightAnchor(this.score, 0.);
        AnchorPane.setTopAnchor(this.score, 0.);
        this.root.getChildren().add(this.score);*/

        background.fitWidthProperty().bind(root.widthProperty());
        background.fitHeightProperty().bind(root.heightProperty());

        primaryStage.setScene(this.scene);


        this.scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.SPACE) {
                try {
                    this.observer.pressSpace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        //this.root.getChildren().add(this.tubeView.getTube());
        //this.root.getChildren().add(this.flappyView.getFlappy());
        //this.observer.startGame();


    }



    @Override
    public void start() {

    }

    public Pane getRoot() {
        return this.root;
    }

    @Override
    public void setObserver(FlappyGameViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void addChildren(Node n) {
        this.root.getChildren().add(n);
    }

    /*@Override
    public void setScore () {

    }*/
}

