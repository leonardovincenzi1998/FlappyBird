package model.bird;

import javafx.scene.shape.Rectangle;

public final class BirdImpl implements Bird {

    static final double INITIAL_POSITION = 50.0;
    static final int WIDTH_BIRD = 45;
    static final int HEIGHT_BIRD = 32;

    private final double posX;
    private double posY;
    private final String birdImagePath;
    private static BirdImpl birdInstance = null;

    private BirdImpl() {
        this.posY = INITIAL_POSITION;
        this.posX = INITIAL_POSITION;
        birdImagePath = ("bird.png");
    }

    public static BirdImpl getInstance() {
        if (birdInstance == null) {
            birdInstance = new BirdImpl();
        }
        return birdInstance;
    }

    @Override
    public void birdUpdate(final Rectangle r, final double n) {
        setPosY(getPosY() + n);
    }

    @Override
    public String getBirdImagePath() {
        return birdImagePath;
    }

    @Override
    public int getWidthBird() {
        return WIDTH_BIRD;
    }

    @Override
    public int getHeightBird() {
        return HEIGHT_BIRD;
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
    public void setBirdInstance() {
        birdInstance = null;
    }
}
