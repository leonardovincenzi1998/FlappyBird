package controllers;

import javafx.scene.shape.Rectangle;
import model.flappy.Flappy;
import view.FlappyView;

public interface FlappyController {

    void setFlappyView();

    void flappyMovement(double n);

    boolean floorCollision(Rectangle r);

    FlappyView getFlappyView();

    Flappy getFlappyModel();
}
