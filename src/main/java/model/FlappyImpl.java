package model;

public class FlappyImpl implements Flappy  {

    private final int widthBird;
    private final int heightBird;
    private double posX;
    private double posY;

    private final String flappyImagePath;

    public FlappyImpl() {
        posX = 50;
        posY = 50;
        widthBird = 50;
        heightBird = 50;
        flappyImagePath = "/res/flappy.png";
    }

    public int getWidthBird() {
        return widthBird;
    }

    public int getHeightBird() {
        return heightBird;
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
