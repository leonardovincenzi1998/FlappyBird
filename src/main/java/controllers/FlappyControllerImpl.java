package controllers;

import javafx.scene.shape.Rectangle;
import model.Flappy;
import model.FlappyImpl;
import view.FlappyBirdView;
import view.FlappyBirdViewImpl;
import view.FlappyViewImpl;

public class FlappyControllerImpl {

    private final FlappyImpl flappy;
    private final FlappyViewImpl flappyView;
    private final FlappyBirdController controller;

    public FlappyControllerImpl(FlappyBirdControllerImpl controller) {
        this.flappy = new FlappyImpl();
        this.flappyView = new FlappyViewImpl(this.flappy);
        this.controller = controller;

    }

    public boolean floorCollision(Rectangle r) {
        if (r.getY() == (335 - flappy.getHeightBird())) {
            System.out.println("QUIT");
            return true;
        }
        return false;
    }



    public Flappy getFlappyModel(){
        return this.flappy;
    }

    public FlappyViewImpl getFlappyView(){
        return this.flappyView;
    }
}
