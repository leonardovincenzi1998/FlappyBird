package controllers;

import javafx.scene.shape.Rectangle;
import model.flappy.Flappy;
import model.flappy.FlappyImpl;
import view.FlappyView;
import view.FlappyViewImpl;

public class FlappyControllerImpl implements FlappyController {

    private final Flappy flappy;
    private final FlappyView flappyView;

    public FlappyControllerImpl() {
        flappy = new FlappyImpl();
        flappyView = new FlappyViewImpl();
        this.setFlappyView();


    }

    @Override
    public void setFlappyView() {
        flappyView.setPosition(flappy.getPosX(),flappy.getPosY());
        flappyView.setWidthHeight(flappy.getHeightBird(),flappy.getWidthBird());
        flappyView.setImage(flappy.getFlappyImagePath());
    }

    @Override
    public void flappyMovement(double n){
        flappy.flappyUpdate(flappyView.getFlappy(), n);
        flappyView.updatePosition(flappy.getPosY());
    }

    @Override
    public boolean floorCollision(Rectangle r) {
        if (r.getY() == (335 - flappy.getHeightBird())) {
            System.out.println("QUIT");
            return true;
        }
        return false;
    }

    @Override
    public FlappyView getFlappyView(){
        return this.flappyView;
    }
}
