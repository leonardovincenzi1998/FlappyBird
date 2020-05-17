package controllers;


import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
<<<<<<< HEAD
import model.FlappyImpl;
=======
import model.Flappy;
import model.Tube;
import model.TubeImpl;
>>>>>>> 85a138a34cf214c14af3b4c961378f9d12c289ea
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;
import view.TubeViewImpl;

public class FlappyBirdControllerImpl implements FlappyBirdController, FlappyGameViewObserver {

<<<<<<< HEAD
    //private final FlappyGame model;
=======


    //private final Flappy flappy;
    private final Tube tube;
>>>>>>> 85a138a34cf214c14af3b4c961378f9d12c289ea
    private final FlappyBirdView view;
    private TubeViewImpl tubeView = null;

    public FlappyBirdControllerImpl(Stage primaryStage) {
        //this.flappy = new FlappyImpl();
        this.tube = new TubeImpl(/*primaryStage.getHeight()*/);
        this.view = new FlappyBirdViewImpl(primaryStage, this);
        //System.out.println(view);
        //this.view.start();

    }

    @Override
    public void startGame() {
        this.tubeView = new TubeViewImpl(this.tube, this);
        //System.out.println("Parte il gioco");
    //DA QUI FACCIO PARTIRE LA CREAZIONE DELL'UCCELLINO E DEI TUBI
<<<<<<< HEAD
       this.view.printBird();


=======
        //System.out.println(this.view.getScreenHeight());
        //System.out.println(this.view.getScreenWidth());
>>>>>>> 85a138a34cf214c14af3b4c961378f9d12c289ea
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



