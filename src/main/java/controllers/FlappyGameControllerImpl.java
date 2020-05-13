package controllers;


import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import view.FlappyGameView;
import view.FlappyGameViewImpl;

public class FlappyGameControllerImpl {

    @FXML
    private Pane pane;

    @FXML
    private ImageView background;

    //private final FlappyGame model;
    private final FlappyGameView view;

    public FlappyGameControllerImpl() {
        this.view = new FlappyGameViewImpl(pane, background);
        this.view.start();
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



