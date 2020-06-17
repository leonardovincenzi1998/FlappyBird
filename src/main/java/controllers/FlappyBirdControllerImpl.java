package controllers;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Score;
import model.ScoreImpl;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;

/**
 * This is the principal controller of the game
 */
public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {

    private final FlappyBirdView view;
    private final TubeController tubeController;
    private final BirdController birdController;
    private final GameLoop gameLoop;
    private final Score score;

    /**
     * This is the constructor method that initializes the game
     * @param primaryStage primaryStage is the window
     */
    public FlappyBirdControllerImpl(final Stage primaryStage) {
        score = new ScoreImpl();
        tubeController = new TubeControllerImpl(this);
        birdController = new BirdControllerImpl();
        gameLoop = new GameLoopImpl(this, primaryStage);
        view = new FlappyBirdViewImpl(primaryStage, this);
        view.start();
    }


    @Override
    public TubeController getTubeController(){
        return tubeController;
    }

    @Override
    public BirdController getBirdController(){
        return birdController;
    }



    @Override
    public void startGame() {
        this.addNode(birdController.getBirdView().getBird());
        tubeController.getTubeMap().printPairTube(tubeController.getTubeMap().getLastValue());
    }

    @Override
    public void pressSpace() {
        gameLoop.userAction();
    }

    @Override
    public void checkCollision() {

        if (this.birdController.floorCollision(this.birdController.getBirdView().getBird())) {
            gameLoop.findCollision();
            this.view.endGame(score.getScore());
            this.birdController.getBirdModel().setBirdInstance();
        }
        if (tubeController.getTubeMap().checkCollision(birdController.getBirdView().getBird())) {
            gameLoop.findCollision();
            this.view.endGame(score.getScore());
            this.birdController.getBirdModel().setBirdInstance();
        }
    }

    @Override
    public void updateScore() {
        score.incrementScore();
        view.setScore(score.getScore());
    }

    @Override
    public Pane getRoot() {
        return view.getRoot();
    }

    @Override
    public void removeNode(final Node n) {
        this.view.removeChildren(n);
    }

    @Override
    public void addNode(final Node n) {
        this.view.addChildren(n);
    }
}




