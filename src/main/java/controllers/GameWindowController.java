package controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import model.FlappyImpl;

import java.io.IOException;

public class GameWindowController {

    double gravity = 20;
    double inc = 1.0;

    @FXML
    private ImageView background;
    @FXML
    private Pane pane;

    FlappyImpl flappy= new FlappyImpl();
    Rectangle r = new Rectangle();
    Image ico = new Image(flappy.getFlappyImagePath());
    Timeline timeline = new Timeline();

    @FXML
    void display(MouseEvent event) {
        r.setTranslateX(flappy.getPosX());
        r.setTranslateY(gravity);
        r.setWidth(flappy.getWidthBird());
        r.setHeight(flappy.getHeightBird());
        r.setFill(new ImagePattern(ico));
        pane.getChildren().add(r);

        timeline = new Timeline(new KeyFrame(
            Duration.seconds(0.025),
            x -> flappyGravity())
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void flappyGravity() {
        gravity= gravity + inc;

        if (gravity >= 335- flappy.getHeightBird()) {
            timeline.stop();
        }
        if (gravity <= 20) {
            inc = 1.0;
        }
        r.setTranslateY(gravity);
    }
    /*@FXML
    public void spacePressed(KeyEvent event) {
        /*

    }*/
}
