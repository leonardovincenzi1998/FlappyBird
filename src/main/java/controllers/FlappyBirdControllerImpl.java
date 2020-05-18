package controllers;


import javafx.scene.Node;
import javafx.stage.Stage;
import model.Flappy;
import model.FlappyImpl;
import model.Tube;
import model.TubeImpl;
import view.*;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {


    //private final Flappy flappy;
    private final Tube tube;
    private final Flappy flappy;
    private final FlappyBirdView view;
    private TubeViewImpl tubeView;
    private FlappyViewImpl flappyView;



    public FlappyBirdControllerImpl(Stage primaryStage) {

        this.tube = new TubeImpl(/*primaryStage.getHeight()*/);
        this.tubeView = new TubeViewImpl(this.tube, this);
        this.flappy = new FlappyImpl();
        flappyView = new FlappyViewImpl(this.flappy, this);
        this.view = new FlappyBirdViewImpl(primaryStage, this, this.flappyView, this.tubeView);
        //System.out.println(view);
        //this.view.start();
        this.flappy.flappyUpdate(flappyView.getFlappy());

    }


    @Override
    public void startGame() {

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



