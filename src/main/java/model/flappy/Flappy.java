package model.flappy;

import javafx.scene.shape.Rectangle;

public interface Flappy {

    void flappyUpdate(Rectangle r, double n);

    String getFlappyImagePath();

    int getWidthBird();

    int getHeightBird();

    double getPosX();

    double getPosY();

    void setPosY(double posY);

}
