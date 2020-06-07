package controllers;


import javafx.scene.Node;
import javafx.stage.Stage;
import model.Score;
import model.ScoreImpl;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;

import java.io.IOException;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {

    private final FlappyBirdView view;
    private final TubeController tubeController;
    private final FlappyController flappyController;
    private final GameLoop gameLoop;
    private final Score score;


    public FlappyBirdControllerImpl(Stage primaryStage) throws IOException {
        score = new ScoreImpl();
        tubeController = new TubeControllerImpl(this);
        flappyController = new FlappyControllerImpl();
        gameLoop = new GameLoopImpl(this, primaryStage);
        view = new FlappyBirdViewImpl(primaryStage,this);

        view.start();
    }

    @Override
    public TubeController getTubeController(){
        return tubeController;
    }

    @Override
    public FlappyController getFlappyController(){
        return flappyController;
    }



    @Override
    public void startGame() {
        this.addNode(flappyController.getFlappyView().getFlappy());
        tubeController.getTubeMap().printPairTube(tubeController.getTubeMap().getLastValue());
    }

    @Override
    public void pressSpace() {
        gameLoop.userAction();
    }

    @Override
    public void checkCollision() throws IOException {
        if (this.flappyController.floorCollision(this.flappyController.getFlappyView().getFlappy())) {

            gameLoop.findCollision();
            this.view.saveScore(score.getScore());
            this.view.getQuitBtn();
        }
        if(tubeController.getTubeMap().checkCollision(flappyController.getFlappyView().getFlappy())){
            gameLoop.findCollision();
            this.view.saveScore(score.getScore());
            this.view.getQuitBtn();

        }
    }

    @Override
    public void updateScore() {
        score.incrementScore();
        view.setScore(score.getScore());
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




