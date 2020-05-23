package controllers;


import javafx.scene.Node;
import javafx.stage.Stage;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {

    private final FlappyBirdView view;
    private TubeControllerImpl tubeController;
    private  FlappyControllerImpl flappyController;
    private GameLoopImpl gameLoop;

    public FlappyBirdControllerImpl(Stage primaryStage) throws Exception {
        tubeController = new TubeControllerImpl();
        flappyController = new FlappyControllerImpl();
        gameLoop = new GameLoopImpl(this, primaryStage);

        this.view = new FlappyBirdViewImpl(primaryStage, this, flappyController.getFlappyView(), tubeController.getTubeView());
        //this.addNode(this.tubeController.getTubeView().getTube());
        this.addNode(this.flappyController.getFlappyView().getFlappy());


        // STAMPA TUBO UCCELLINO



        // PRE IMPLEMENTAZIONE GAMELOOP
        //this.tubeController.getTubeModel().tubeUpdate(this.tubeController.getTubeView().getTube());
        //this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy());



    }

    public void initialGame(){
        this.flappyController.getFlappyModel().flappyUpdate(this.flappyController.getFlappyView().getFlappy());
    }

    public void pressSpace() {
       //this.flappyController.getFlappyModel().flappyJump(this.flappyController.getFlappyView().getFlappy());
        //System.out.println("prova");
    }

    @Override
    public void startGame() {
        //gameLoop = new GameLoopImpl(this.tubeController, this.flappyController);
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



