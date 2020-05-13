package model;

import javafx.scene.image.Image;

public class FlappyImpl implements Flappy  {

    private final int widthBird;
    private final int heightBird;
    private double posX;
    private double posY;

    /*private final String flappyImagePath;*/


    public FlappyImpl() {
        posX = 50;
        posY = 50;
        widthBird = 45;
        heightBird = 32;
        /*flappyImagePath = "/flappy.png";*/
    }

    /*public String getFlappyImagePath() { return flappyImagePath; }*/

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
