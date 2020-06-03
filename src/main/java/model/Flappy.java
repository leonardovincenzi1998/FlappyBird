package model;

import javafx.scene.shape.Rectangle;

import java.awt.*;
import java.io.IOException;

public interface Flappy {

    void flappyUpdate(Rectangle r,double n);
    //void flappyJump(Rectangle r);

    //void flappyGravity(Rectangle r, double inc);

    String getFlappyImagePath();

    int getWidthBird();

    int getHeightBird();

    double getPosX();

    void setPosX(double posX);

    double getPosY();

    void setPosY(double posY);

}
