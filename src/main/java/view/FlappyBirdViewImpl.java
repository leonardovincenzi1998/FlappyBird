package view;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import model.TubeImpl;

import java.awt.*;

public class FlappyBirdViewImpl implements FlappyBirdView {

    private static final String TITLE = "Flappy Bird";
    private static final double HEIGHT = 335;
    private static final double WIDTH = 600;
    //private static final int FONT_SIZE = 20;
    //private final Label score = new Label();
    private final Stage primaryStage;
    private Pane root;
    //private Group group;
    private Scene scene;
    private FlappyGameViewObserver observer;
    final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private TubeViewImpl tubeView;



    public FlappyBirdViewImpl(final Stage primaryStage, final FlappyGameViewObserver observer, TubeViewImpl tubeView) {
        this.primaryStage = primaryStage;
        this.observer = observer;
        this.tubeView = tubeView;
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
        this.root = new Pane();
        //this.group = new Group();
        //this.root.getChildren().add(group);
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

        background.fitWidthProperty().bind(this.root.widthProperty());
        background.fitHeightProperty().bind(this.root.heightProperty());
        //background.setPreserveRatio(true); //BOH
        this.observer.startGame();
        primaryStage.setScene(this.scene);

        this.root.getChildren().add(this.tubeView.getTube());

        /*root.setOnMouseMoved(arg0 -> {
            if (arg0.getEventType() == MouseEvent.MOUSE_MOVED) {
                System.out.println(arg0.getX() + "," + arg0.getY());
            }

        });*/

        /*Tooltip tp = new Tooltip("at stack tool");
        root.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                Node  node =(Node)t.getSource();
                tp.show(node, primaryStage.getX()+t.getSceneX(), primaryStage.getY()+t.getSceneY());
            }
        });*/

        /*Circle cercle = new Circle();
        cercle.setCenterX(300);
        cercle.setCenterY(200);
        cercle.setRadius(100);
        cercle.setFill(Color.YELLOW);
        cercle.setStroke(Color.ORANGE);
        cercle.setStrokeWidth(5);

        this.root.getChildren().add(cercle);*/
        //this.root.getChildren().add(tubo);

    }

    @Override
    public void start() {

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

