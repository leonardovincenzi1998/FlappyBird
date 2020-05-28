package controllers;


import javafx.scene.Node;
import javafx.stage.Stage;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;

import java.io.IOException;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {

    private final FlappyBirdView view;
    private TubeControllerImpl tubeController;
    private  FlappyControllerImpl flappyController;
    private GameLoopImpl gameLoop;

    public FlappyBirdControllerImpl(Stage primaryStage) throws Exception {
        tubeController = new TubeControllerImpl();
        flappyController = new FlappyControllerImpl(this);
        gameLoop = new GameLoopImpl(this, primaryStage);

        this.view = new FlappyBirdViewImpl(primaryStage, this, flappyController.getFlappyView(), tubeController.getTubeView());
        //this.addNode(this.tubeController.getTubeView().getTube());
        this.addNode(this.flappyController.getFlappyView().getFlappy());

    }

    public void initialGame(double n){
        this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy(),n);
    }

    @Override
    public void pressSpace() {
        gameLoop.spazioPremuto();
        //this.flappyController.getFlappyModel().flappyJump(this.flappyController.getFlappyView().getFlappy());
    }

    public void quit() {
        if (this.flappyController.floorCollision(this.flappyController.getFlappyView().getFlappy())) {
            System.out.println("quit");
            this.view.quitBtn();
        }
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



