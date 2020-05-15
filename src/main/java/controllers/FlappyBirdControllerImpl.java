package controllers;


import javafx.stage.Stage;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyGameViewObserver;

public class FlappyBirdControllerImpl implements FlappyGameViewObserver {



    //private final FlappyGame model;
    private final FlappyBirdView view;

    public FlappyBirdControllerImpl(Stage primaryStage) {
        this.view = new FlappyBirdViewImpl(primaryStage, (FlappyGameViewObserver) this);
        //System.out.println(view);
        //this.view.start();

    }


    @Override
    public void startGame() {
        //System.out.println("Parte il gioco");
    //DA QUI FACCIO PARTIRE LA CREAZIONE DELL'UCCELLINO E DEI TUBI

    }

    @Override
    public void quit() {

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



