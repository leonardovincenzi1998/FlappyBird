package controllers;

import javafx.scene.shape.Rectangle;
import model.bird.Bird;
import model.bird.BirdImpl;
import view.BirdView;
import view.BirdViewImpl;

public class BirdControllerImpl implements BirdController {

    private final Bird flappy;
    private final BirdView flappyView;

    public BirdControllerImpl() {
        flappy = BirdImpl.getInstance();
        flappyView = new BirdViewImpl();
        this.setBirdView();
    }

    @Override
    public void setBirdView() {
        flappyView.setPosition(flappy.getPosX(), flappy.getPosY());
        flappyView.setWidthHeight(flappy.getHeightBird(), flappy.getWidthBird());
        flappyView.setImage(flappy.getBirdImagePath());
    }

    @Override
    public void birdMovement(final double n) {
        flappy.birdUpdate(flappyView.getBird(), n);
        flappyView.updatePosition(flappy.getPosY());
    }

    @Override
    public boolean floorCollision(final Rectangle r) {
        return r.getY() == (335 - flappy.getHeightBird());
    }

    @Override
    public BirdView getBirdView() {
        return this.flappyView;
    }

    @Override
    public Bird getBirdModel(){
        return this.flappy;
    }
}