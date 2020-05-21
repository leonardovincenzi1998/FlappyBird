package controllers;


import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.Flappy;
import model.FlappyImpl;
import model.Tube;
import model.TubeImpl;
import view.*;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {

    private final FlappyBirdView view;
    private TubeControllerImpl tubeController;
    private FlappyControllerImpl flappyController;
    private GameLoopImpl gameLoop;


    public FlappyBirdControllerImpl(Stage primaryStage) {
        this.tubeController = new TubeControllerImpl();
        this.flappyController = new FlappyControllerImpl();
        this.gameLoop = new GameLoopImpl(this.tubeController, this.flappyController);

        this.view = new FlappyBirdViewImpl(primaryStage, this, this.flappyController.getFlappyView(), this.tubeController.getTubeView());

        // STAMPA TUBO UCCELLINO
        //this.addNode(this.tubeController.getTubeView().getTube());
        //this.addNode(this.flappyController.getFlappyView().getFlappy());

        // PRE IMPLEMENTAZIONE GAMELOOP
        //this.tubeController.getTubeModel().tubeUpdate(this.tubeController.getTubeView().getTube());
        //this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy());


    }

    public void pressSpace() {
       //this.flappyController.getFlappyModel().flappyReverse(this.flappyController.getFlappyView().getFlappy());
        //System.out.println("prova");
    }

    @Override
    public void startGame() {
        this.pressSpace();

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



