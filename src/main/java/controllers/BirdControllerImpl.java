package controllers;

import javafx.scene.shape.Rectangle;
import model.bird.Bird;
import model.bird.BirdImpl;
import view.BirdView;
import view.BirdViewImpl;

public class BirdControllerImpl implements BirdController {

    /**
     * Screen height.
     */
    public static final int SCREEN_HEIGHT = 335;

    private final Bird bird;
    private final BirdView birdView;

    /**
     * This is the constructor method that initialize all classes of bird and set the bird view.
     */
    public BirdControllerImpl() {
        bird = BirdImpl.getInstance();
        birdView = new BirdViewImpl();
        this.setBirdView();
    }

    @Override
    public void setBirdView() {
        birdView.setPosition(bird.getPosX(), bird.getPosY());
        birdView.setWidthHeight(bird.getHeightBird(), bird.getWidthBird());
        birdView.setImage(bird.getBirdImagePath());
    }

    @Override
    public void birdMovement(final double n) {
        bird.birdUpdate(birdView.getBird(), n);
        birdView.updatePosition(bird.getPosY());
    }

    @Override
    public boolean floorCollision(final Rectangle r) {
        return r.getY() == (SCREEN_HEIGHT - bird.getHeightBird());
    }

    @Override
    public BirdView getBirdView() {
        return this.birdView;
    }

    @Override
    public Bird getBirdModel() {
        return this.bird;
    }
}
