package controllers;


import javafx.scene.Node;
import javafx.stage.Stage;
import util.Pair;
import controllers.utilities.TubeMap;
import controllers.utilities.TubeMapImpl;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;

import java.io.IOException;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {

    private final FlappyBirdView view;
    private final TubeControllerImpl tubeController;
    private final FlappyControllerImpl flappyController;
    private final GameLoopImpl gameLoop;


    public FlappyBirdControllerImpl(Stage primaryStage) throws Exception {
        tubeController = new TubeControllerImpl(this);
        flappyController = new FlappyControllerImpl(this);
        gameLoop = new GameLoopImpl(this, primaryStage, tubeController);
        view = new FlappyBirdViewImpl(primaryStage, this, flappyController.getFlappyView());
        view.start();
    }

    @Override
    public void startGame() {
        this.addNode(flappyController.getFlappyView().getFlappy());
        tubeController.getTubeMap().printPairTube(tubeController.getTubeMap().getLastValue());
    }

    @Override
    public void flappyMovement(double n){
        this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy(), n);
    }

    @Override
    public void pressSpace() {
        gameLoop.userAction();
    }

    public void checkCollision() {
        if (this.flappyController.floorCollision(this.flappyController.getFlappyView().getFlappy())) {
            gameLoop.collision();
            this.view.quitBtn();
        }
        if(tubeController.getTubeMap().checkCollision(flappyController.getFlappyView().getFlappy())){
            gameLoop.collision();
            this.view.quitBtn();
        }

    }

    @Override
    public void removeNode(Node n) {
        this.view.removeChildren(n);
    }

    @Override
    public void addNode(final Node n) {
        this.view.addChildren(n);
    }
}




