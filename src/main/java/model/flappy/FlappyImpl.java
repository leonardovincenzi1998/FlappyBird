package model.flappy;

import javafx.scene.shape.Rectangle;

public final class FlappyImpl implements Flappy {

    private final double posX;
    private double posY;
    private final String flappyImagePath;
    private static FlappyImpl flappyInstance = null;

    private FlappyImpl() {
        this.posY = 50.0;
        this.posX = 50.0;
        flappyImagePath = ("bird.png");
    }

    public static FlappyImpl getInstance() {
        if (flappyInstance == null) {
            flappyInstance = new FlappyImpl();
        }
        return  flappyInstance;
    }

    @Override
    public void flappyUpdate(final Rectangle r, final double n) {
        setPosY(getPosY() + n);
    }

    @Override
    public String getFlappyImagePath() {
        return flappyImagePath;
    }

    @Override
    public int getWidthBird() {
        return 45;
    }

    @Override
    public int getHeightBird() {
        return 32;
    }

    @Override
    public double getPosY() {
        return posY;
    }

    public double getPosX() {
        return posX; }

    @Override
    public void setPosY(final double posY) {
        this.posY = posY;
    }
}
