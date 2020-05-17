package model;

public class FlappyImpl implements Flappy  {

    private double posX;
    private double posY;
    private final String flappyImagePath;


    public FlappyImpl() {
        posX = 50;
        posY = 50;
        flappyImagePath = ("file:res/flappy.png");
    }

    public String getFlappyImagePath() {
        return flappyImagePath;
    }

    public int getWidthBird() {
        return 55;
    }

    public int getHeightBird() {
        return 150;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }


}
