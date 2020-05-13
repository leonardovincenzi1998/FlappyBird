package controllers;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import model.FlappyImpl;

import java.awt.*;
import java.io.IOException;

public class GameWindowController {
    FlappyImpl flappy= new FlappyImpl();
    Image ico = new Image("/flappy.png");


    @FXML
    private ImageView background;
    @FXML
    private Pane pane;
    @FXML
    void display(MouseEvent event) {
            Rectangle r = new Rectangle();
            r.setY(flappy.getPosY());
            r.setWidth(flappy.getWidthBird());
            r.setHeight(flappy.getHeightBird());
            r.setFill(new ImagePattern(ico));
            pane.getChildren().add(r);
    }

}
