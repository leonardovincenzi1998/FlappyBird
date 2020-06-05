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
    private  FlappyControllerImpl flappyController;
    private GameLoopImpl gameLoop;
    private TubeMap tubeMap;


    public FlappyBirdControllerImpl(Stage primaryStage) throws Exception {
        tubeMap = new TubeMapImpl();
        tubeController = new TubeControllerImpl(tubeMap, this);
        flappyController = new FlappyControllerImpl(this);
<<<<<<< HEAD
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
=======
        gameLoop = new GameLoopImpl(this, primaryStage, tubeController);
        view = new FlappyBirdViewImpl(primaryStage, this, flappyController.getFlappyView());
        view.start();
>>>>>>> 4540c5e9cfc6bcea5b06f52317ac1d1180c36f4c
    }

    @Override
    public void startGame() {
        this.addNode(flappyController.getFlappyView().getFlappy());
        tubeController.printPairTube(tubeController.getTubeMap().getLastValue());
    }

<<<<<<< HEAD
    public void initialGame(){
        this.flappyController.getFlappyModel().getDown(this.flappyController.getFlappyView().getFlappy());
=======

    @Override
    public void flappyMovement(double n){
        this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy(), n);
        //this.flappyController.getFlappyView().getFlappy().setY(this.flappyController.getFlappyModel().getPosY());
>>>>>>> 4540c5e9cfc6bcea5b06f52317ac1d1180c36f4c
    }

    @Override
    public void pressSpace() {
<<<<<<< HEAD
        gameLoop.spazioPremuto();
        }

    public void salta() {
        this.flappyController.getFlappyModel().getJump(this.flappyController.getFlappyView().getFlappy());
    }

    public void startGame() {
        this.pressSpace();
    }

    public void checkCollision() {
        if ((this.flappyController.floorCollision(this.flappyController.getFlappyView().getFlappy()))) {
            System.out.println("quit");
=======
        gameLoop.userAction();
    }

    public void checkCollision() {
        if (this.flappyController.floorCollision(this.flappyController.getFlappyView().getFlappy())) {
            //this.flappyController.getFlappyModel().flappyStop(this.flappyController.getFlappyView().getFlappy());

>>>>>>> 4540c5e9cfc6bcea5b06f52317ac1d1180c36f4c
            gameLoop.collision();
            this.view.quitBtn();
        }
        if(tubeController.getTubeMap().checkCollision(flappyController.getFlappyView().getFlappy())){
            gameLoop.collision();
            this.view.quitBtn();
        }

    }
<<<<<<< HEAD
    
=======

    @Override
    public void removeNode(Node n) {
        this.view.removeChildren(n);
    }


>>>>>>> 4540c5e9cfc6bcea5b06f52317ac1d1180c36f4c
    @Override
    public void addNode(final Node n) {
        this.view.addChildren(n);
    }
}




