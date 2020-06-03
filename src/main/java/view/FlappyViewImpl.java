package view;

import controllers.FlappyBirdController;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import model.Flappy;
import model.FlappyImpl;

import java.awt.*;

public class FlappyViewImpl {

    Rectangle r = new Rectangle();
    Image ico;

    public FlappyViewImpl(final Flappy flappy) {
        this.ico = new Image(flappy.getFlappyImagePath());
        r.setX(flappy.getPosX());
        r.setY(flappy.getPosY());
        r.setWidth(flappy.getWidthBird());
        r.setHeight(flappy.getHeightBird());
        r.setFill(new ImagePattern(ico));
    }

    public Rectangle getFlappy(){
        return this.r;
    }
}
