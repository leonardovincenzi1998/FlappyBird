package model;

import javafx.scene.shape.Rectangle;

import java.awt.*;

public interface Flappy {

    //void jump(Rectangle r);
    void flappyJump(Rectangle r);

    void flappyGravity(Rectangle r, double inc);

    void flappyUpdate(Rectangle r);

    String getFlappyImagePath();

    int getWidthBird();

    int getHeightBird();

    double getPosX();

    void setPosX(double posX);

    double getPosY();

    void setPosY(double posY);

}
