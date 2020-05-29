package model;

import javafx.scene.shape.Rectangle;

import java.awt.*;
import java.io.IOException;

public interface Flappy {

    //void gravity(Rectangle flappy);

    //void flappyJump(Rectangle r);

    //void flappyGravity(Rectangle r, double inc);
    void flappyUp(Rectangle r);

<<<<<<< HEAD
    void flappyDown(Rectangle r);
=======
    void flappyUpdate(Rectangle r, double n);
>>>>>>> be1bf76344845f50f09ab0a0f40d1840992607d3

    String getFlappyImagePath();

    int getWidthBird();

    int getHeightBird();

    double getPosX();

    void setPosX(double posX);

    double getPosY();

    void setPosY(double posY);

}
