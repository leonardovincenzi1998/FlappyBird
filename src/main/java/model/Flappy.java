package model;

public interface Flappy {

    double getGravity();
    void flappyUpdate();
    void flappyGravity();
    String getFlappyImagePath();
    int getWidthBird();
    int getHeightBird();
    double getPosX();
    void setPosX(double posX);
    double getPosY();
    void setPosY(double posY);

}
