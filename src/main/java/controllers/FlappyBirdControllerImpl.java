package controllers;


import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import util.Pair;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;

import java.io.IOException;


public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {

    private final FlappyBirdView view;
    private final TubeControllerImpl tubeController;
    private  FlappyControllerImpl flappyController;
    private GameLoopImpl gameLoop;

    public FlappyBirdControllerImpl(Stage primaryStage) throws Exception {
        tubeController = new TubeControllerImpl();
        flappyController = new FlappyControllerImpl(this);
        gameLoop = new GameLoopImpl(this, primaryStage);
        this.view = new FlappyBirdViewImpl(primaryStage, this, flappyController.getFlappyView()/*, tubeController.getTubeMap()*/);


        this.addNode(flappyController.getFlappyView().getFlappy());
        printPairTube(tubeController.getTubeMap().entrySet().iterator().next().getValue());

        this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy());

    }

    public void printPairTube(Pair tubePair){
        addNode((Node) tubePair.getX());
        addNode((Node) tubePair.getY());
    }

    public void scrollTubes(){
        tubeController.scrollTubePair(tubeController.getTubeMap());

    }


    @Override
    public void addTube() throws Exception {
        this.tubeController.addToMap();
        printPairTube(tubeController.getTubeMap().get((tubeController.getTubeMap().size())));

    }


    public void pressSpace() {
        this.flappyController.getFlappyModel().flappyJump(this.flappyController.getFlappyView().getFlappy());
        //System.out.println("prova")
        }

    public void startGame() {
        this.pressSpace();
    }

    public void checkBorderCollision() {
        if ((this.flappyController.groundCollision(this.flappyController.getFlappyView().getFlappy()))) {
            System.out.println("quit");
            gameLoop.collision();
            this.view.quitBtn();
        }

        if ((this.flappyController.roofCollision(this.flappyController.getFlappyView().getFlappy()))) {
            System.out.println("quit");
            gameLoop.collision();
            this.view.quitBtn();
        }
    }


    @Override
    public void addNode(final Node n) {
        this.view.addChildren(n);
    }
}




