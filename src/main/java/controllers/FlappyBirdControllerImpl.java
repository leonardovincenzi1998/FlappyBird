package controllers;


import javafx.scene.Node;
import javafx.stage.Stage;
import util.Pair;
import util.TubeMap;
import util.TubeMapImpl;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;

import java.io.IOException;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {

    private final FlappyBirdView view;
    private final TubeControllerImpl tubeController;
    private  FlappyControllerImpl flappyController;
    private GameLoopImpl gameLoop;
    private TubeMap tubeMap;


    public FlappyBirdControllerImpl(Stage primaryStage) throws Exception {
        tubeMap = new TubeMapImpl();
        tubeController = new TubeControllerImpl(tubeMap);
        flappyController = new FlappyControllerImpl(this);
        gameLoop = new GameLoopImpl(this, primaryStage);
        this.view = new FlappyBirdViewImpl(primaryStage, this, flappyController.getFlappyView()/*, tubeController.getTubeMap()*/);


        this.addNode(flappyController.getFlappyView().getFlappy());
        printPairTube(tubeController.getTubeMap().getLastValue());
    }

    public void printPairTube(Pair tubePair){
        addNode((Node) tubePair.getX());
        addNode((Node) tubePair.getY());
    }

    public void scrollTubes(){
        tubeController.getTubeMap().scrollTubePair();
        tubeController.getTubeMap().checkWindowEnd();
    }


    @Override
    public void addTube() {
        this.tubeController.getTubeMap().addToMap(tubeController.createTubePair());
        printPairTube(tubeController.getTubeMap().getLastValue());
    }

    public void initialGame(double n){
        this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy(), n);
    }

    @Override
    public void pressSpace() {
        gameLoop.spazioPremuto();
        }

    public void startGame() {
        this.pressSpace();
    }

    public void checkCollision() {
        if ((this.flappyController.floorCollision(this.flappyController.getFlappyView().getFlappy()))) {
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




