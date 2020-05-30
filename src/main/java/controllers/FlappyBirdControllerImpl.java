package controllers;


import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import util.Pair;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;



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


    @Override
    public void initialGame(double n){
        this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy(),n);
    }

    @Override
    public void pressSpace() {
        gameLoop.spazioPremuto();
    }


    public void checkCollision() {
        if (this.flappyController.floorCollision(this.flappyController.getFlappyView().getFlappy())) {
            //this.flappyController.getFlappyModel().flappyStop(this.flappyController.getFlappyView().getFlappy());
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




