package controllers;


import javafx.scene.Node;
import javafx.stage.Stage;
import model.Flappy;
import model.FlappyImpl;
import model.Tube;
import model.TubeImpl;
import view.*;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {

    private final Flappy flappy;
    private final FlappyBirdView view;
    private FlappyViewImpl flappyView;
    private TubeControllerImpl tubeController;



    public FlappyBirdControllerImpl(Stage primaryStage) {
        this.tubeController = new TubeControllerImpl();

        this.flappy = new FlappyImpl();
        this.flappyView = new FlappyViewImpl(this.flappy, this);

        this.view = new FlappyBirdViewImpl(primaryStage, this, this.flappyView, this.tubeController.getTubeView());
        //System.out.println(view);
        //this.view.start();
        this.addNode(this.tubeController.getTubeView().getTube());
        this.addNode(this.flappyView.getFlappy());

        this.tubeController.getTubeModel().tubeUpdate(this.tubeController.getTubeView().getTube());
        //this.flappy.flappyUpdate(this.flappyView.getFlappy());

        //this.tube.tubeUpdate(this.tubeView.getTube());


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



