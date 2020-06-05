package controllers;

import javafx.scene.shape.Rectangle;
import model.Flappy;
import model.FlappyImpl;
import view.FlappyViewImpl;

public class FlappyControllerImpl {

    private final Flappy flappy;
    private final FlappyViewImpl flappyView;
    private final FlappyBirdController controller;

    public FlappyControllerImpl(FlappyBirdControllerImpl controller) {
        flappy = new FlappyImpl();
        flappyView = new FlappyViewImpl();
        this.setFlappyView();
        this.controller = controller;


    }

    public void setFlappyView() {
        flappyView.setPosition(flappy.getPosX(),flappy.getPosY());
        flappyView.setWidthHeight(flappy.getHeightBird(),flappy.getWidthBird());
        flappyView.setImage(flappy.getFlappyImagePath());
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
