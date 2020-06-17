package controllers;

import javafx.scene.shape.Rectangle;
import model.bird.Bird;
import view.BirdView;

public interface BirdController {

    void setBirdView();

    void birdMovement(double n);

    boolean floorCollision(Rectangle r);

    BirdView getBirdView();

    Bird getBirdModel();
}
