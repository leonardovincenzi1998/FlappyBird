package controllers;


import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.Tube;
import model.TubeImpl;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;
import view.TubeViewImpl;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {



    //private final Flappy flappy;
    private final Tube tube;
    private final FlappyBirdView view;
    private TubeViewImpl tubeView;
    //public Rectangle r = new Rectangle();


    public FlappyBirdControllerImpl(Stage primaryStage) {
        //this.flappy = new FlappyImpl();
        this.tube = new TubeImpl(/*primaryStage.getHeight()*/);
        this.tubeView = new TubeViewImpl(this.tube, this);
        this.view = new FlappyBirdViewImpl(primaryStage, this, this.tubeView);
        //System.out.println(view);
        //this.view.start();

    }


    @Override
    public void startGame() {

        //final Rectangle prova = this.tubeView.getTube();
        //this.view.addChildren(this.tubeView.getTube());


        //System.out.println(this.tubeView.getTube());
        //this.addNode(this.tubeView.getTube());
        //System.out.println("Parte il gioco");
    //DA QUI FACCIO PARTIRE LA CREAZIONE DELL'UCCELLINO E DEI TUBI
        //System.out.println(this.view.getScreenHeight());
        //System.out.println(this.view.getScreenWidth());
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



