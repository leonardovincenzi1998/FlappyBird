package model.flappy;

import javafx.scene.shape.Rectangle;

public class FlappyImpl implements Flappy{

    private double posX;
    private double posY;
    private double gravity = 20;
    private final String flappyImagePath;

    public FlappyImpl() {
        posX = 50;
        posY = 50;
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
    public double getPosX() {
        return posX;
    }

    @Override
    public void setPosX(double posX) {
        this.posX = posX;
    }

    @Override
    public double getPosY() {
        return posY;
    }

    @Override
    public void setPosY(double posY) {
        this.posY = posY;
    }


}
