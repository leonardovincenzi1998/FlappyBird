package controllers;


import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import util.Pair;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;

<<<<<<< HEAD
import java.util.Map;
=======
import java.io.IOException;
>>>>>>> be1bf76344845f50f09ab0a0f40d1840992607d3

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


<<<<<<< HEAD
        //this.addNode(this.tubeController.getTubeView().getTubeUp());
        //this.addNode(this.tubeController.getTubeView().getTubeDown());
        //this.addNode(this.flappyController.getFlappyView().getFlappy());

        //System.out.println(tubeController.createTubePair());
        //printMap(tubeController.getTubeMap());
        /*System.out.println(tubeController.getTubeMap());
        tubeController.addToMap();
        System.out.println(tubeController.getTubeMap());
        tubeController.addToMap();
        System.out.println(tubeController.getTubeMap());*/
        // STAMPA TUBO UCCELLINO

        //printPairTube(tubeController.getTubeMap().entrySet().iterator().next().getValue());
        //System.out.println(tubeController.getTubeMap().entrySet().stream().findFirst().get().getValue());
        printPairTube(tubeController.getTubeMap().entrySet().iterator().next().getValue());
        //printPairTube(tubeController.get);
        //printMap(tubeController.getTubeMap());
        //System.out.println(tubeController.getTubeMap());
        /*tubeController.addToMap();
        System.out.println(tubeController.getTubeMap());*/
        /*tubeController.addToMap();
        System.out.println(tubeController.getTubeMap());*/
        // PRE IMPLEMENTAZIONE GAMELOOP
        //this.tubeController.getTubeModel().tubeUpdate(this.tubeController.getTubeView().getTube());
        //this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy());



    }

    public void printPairTube(Pair tubePair){
        addNode((Node) tubePair.getX());
        addNode((Node) tubePair.getY());
    }

    public void scrollTubes(){
        /*tubeController.getTubeMap().forEach((key, value) -> {
            this.tubeController.scrollTubePair((Rectangle) value.getX());
            this.tubeController.scrollTubePair((Rectangle) value.getY());
        });*/
        tubeController.scrollTubePair(tubeController.getTubeMap());

    }

    public void initialGame(){
        //this.flappyController.getFlappyModel().flappyDown(this.flappyController.getFlappyView().getFlappy());

    }

    @Override
    public void addTube() throws Exception {
        this.tubeController.addToMap();
        //System.out.println(tubeController.getTubeMap());
        //System.out.println(tubeController.getTubeMap().get((tubeController.getTubeMap().size())));
        printPairTube(tubeController.getTubeMap().get((tubeController.getTubeMap().size())));
        //System.out.println(tubeController.getTubeMap());
        //printMap(tubeController.getTubeMap());
        //printMap(tubeController.getTubeMap());
        //System.out.println(tubeController.getTubeMap());
    }

    public void flappyJump(){
        //this.flappyController.getFlappyModel().flappyUp(this.flappyController.getFlappyView().getFlappy());
    }

    /*public void pressSpace() {
        //gameLoop.update();
       //this.flappyController.getFlappyModel().flappyJump(this.flappyController.getFlappyView().getFlappy());
        //System.out.println("prova");
    }*/

    @Override
    public void pressSpace() throws Exception {

    }



    @Override
=======
    }

    public void initialGame(double n){
        this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy(),n);
    }

    @Override
    public void pressSpace() {
        gameLoop.spazioPremuto();
        //this.flappyController.getFlappyModel().flappyJump(this.flappyController.getFlappyView().getFlappy());
    }

>>>>>>> be1bf76344845f50f09ab0a0f40d1840992607d3
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



