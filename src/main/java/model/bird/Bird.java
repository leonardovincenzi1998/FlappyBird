package model.bird;

import javafx.scene.shape.Rectangle;

public interface Bird {

    void birdUpdate(Rectangle r, double n);

    String getBirdImagePath();

    int getWidthBird();

    int getHeightBird();

    double getPosX();

    double getPosY();

    void setPosY(double posY);

    void setBirdIstance();

}
