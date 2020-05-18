package controllers;


import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.FlappyImpl;
import model.Flappy;
import model.Tube;
import model.TubeImpl;
import view.*;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {


    //private final Flappy flappy;
    //private final Tube tube;
    private final Flappy flappy;
    private final FlappyBirdView view;



    public FlappyBirdControllerImpl(Stage primaryStage) {
        //this.flappy = new FlappyImpl();
        this.flappy = new FlappyImpl();
        FlappyViewImpl flappyView = new FlappyViewImpl(this.flappy, this);
        this.view = new FlappyBirdViewImpl(primaryStage, this, flappyView);
        //System.out.println(view);
        //this.view.start();
        this.flappy.flappyUpdate(flappyView.getFlappy());

    }


    @Override
    public void startGame() {




        //System.out.println(this.view.getScreenHeight());
        //System.out.println(this.view.getScreenWidth());

    }

    @Override
    public void quit() {

    }


    @Override
    public void addNode(final Node n) {
        this.view.addChildren(n);
    }
}
    //creo istanza uccellino

    //creo istanza tubo
    /*@FXML
    private Pane pane;

    @FXML
    private ImageView background;

    @FXML
    void display(MouseEvent event) {
        background.fitWidthProperty().bind(pane.widthProperty());
        background.fitHeightProperty().bind(pane.heightProperty());*/



    //background.setVisible(false);



