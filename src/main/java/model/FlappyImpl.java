package model;

import javafx.scene.shape.Rectangle;

public class FlappyImpl implements Flappy{

    private final double posX;
    private double posY;
    private final String flappyImagePath;

    public FlappyImpl() {
        this.posY = 50.0;
        this.posX = 50.0;
        flappyImagePath = ("bird.png");
    }

    @Override
    public void flappyUpdate(Rectangle r, double n) {
        setPosY(getPosY()+n);
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
    public void setPosY(double posY) {
        this.posY = posY;
    }

}
