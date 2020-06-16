package model.flappy;

import javafx.scene.shape.Rectangle;

public final class FlappyImpl implements Flappy {

    static final double INITIAL_POSITION = 50.0;
    static final int HEIGHT_BIRD = 45;

    private final double posX;
    private double posY;
    private final String flappyImagePath;
    private static FlappyImpl flappyInstance = null;

    private FlappyImpl() {
        this.posY = INITIAL_POSITION;
        this.posX = INITIAL_POSITION;
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
        return HEIGHT_BIRD;
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

    @Override
    public void setFlappyInstance() {
        flappyInstance = null;
    }
}
