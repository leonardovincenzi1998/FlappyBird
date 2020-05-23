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
    private final TubeControllerImpl tubeController = new TubeControllerImpl();
    private final FlappyControllerImpl flappyController = new FlappyControllerImpl();


    public FlappyBirdControllerImpl(Stage primaryStage) {
        TubeControllerImpl tubeController = new TubeControllerImpl();
        FlappyControllerImpl flappyController = new FlappyControllerImpl();


        this.view = new FlappyBirdViewImpl(primaryStage, this, flappyController.getFlappyView(), tubeController.getTubeView());
        //GameLoopImpl gameLoop = new GameLoopImpl(tubeController, flappyController);


        this.addNode(this.tubeController.getTubeView().getTube());
        this.addNode(this.flappyController.getFlappyView().getFlappy());

        // PRE IMPLEMENTAZIONE GAMELOOP
        this.tubeController.getTubeModel().tubeUpdate(this.tubeController.getTubeView().getTube());
        this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy());


    }

    public void pressSpace() {
       this.flappyController.getFlappyModel().flappyJump(this.flappyController.getFlappyView().getFlappy());
       System.out.println("prova");
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



